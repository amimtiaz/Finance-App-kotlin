package com.imtiaz_acedamy.financeappkotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.imtiaz_acedamy.financeappkotlin.Domain.BudgetDomain
import com.imtiaz_acedamy.financeappkotlin.R
import com.imtiaz_acedamy.financeappkotlin.databinding.ViewholderBudgetBinding
import java.text.DecimalFormat

class ReportListAdapter(private val items:MutableList<BudgetDomain>): RecyclerView.Adapter<ReportListAdapter.Viewholder>() {
    class Viewholder(val binding: ViewholderBudgetBinding):RecyclerView.ViewHolder(binding.root)

    private lateinit var context: Context
    var formater:DecimalFormat?=null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReportListAdapter.Viewholder {
        context = parent.context
        formater= DecimalFormat("###,###,###,###")
        val binding=ViewholderBudgetBinding.inflate(LayoutInflater.from(context),parent,false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: ReportListAdapter.Viewholder, position: Int) {
        val item = items[position]
        holder.binding.titleTxt.text = item.title
        holder.binding.priceTxt.text = "$ ${formater?.format(item.price)} /Month"
        holder.binding.percentTxt.text = "${item.percent}%"

        holder.binding.progressCircular.apply {
            progress = item.percent.toFloat()

            if (position%2==1){
                progressBarColor = context.resources.getColor(R.color.blue)
                holder.binding.percentTxt.setTextColor(context.resources.getColor(R.color.blue))
            }else{
                progressBarColor = context.resources.getColor(R.color.pink)
                holder.binding.percentTxt.setTextColor(context.resources.getColor(R.color.pink))
            }
        }
    }

    override fun getItemCount(): Int = items.size
}