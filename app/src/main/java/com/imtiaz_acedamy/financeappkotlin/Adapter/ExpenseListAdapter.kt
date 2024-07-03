package com.imtiaz_acedamy.financeappkotlin.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.imtiaz_acedamy.financeappkotlin.Domain.ExpenseDomain
import com.imtiaz_acedamy.financeappkotlin.databinding.ViewholderItemsBinding
import java.text.DecimalFormat

class ExpenseListAdapter(private val items:MutableList<ExpenseDomain>): RecyclerView.Adapter<ExpenseListAdapter.Viewholder>() {

    class Viewholder (val binding:ViewholderItemsBinding):RecyclerView.ViewHolder(binding.root)

    private lateinit var context: Context
    var formatter:DecimalFormat?=null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExpenseListAdapter.Viewholder {

        context = parent.context
        formatter=DecimalFormat("###,###,###.##")
        val binding = ViewholderItemsBinding.inflate(LayoutInflater.from(context),parent,false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: ExpenseListAdapter.Viewholder, position: Int) {
        val item = items[position]
        holder.binding.titleTxt.text = item.title
        holder.binding.timeTxt.text = item.time
        holder.binding.priceTxt.text = "$"+formatter?.format(item.price)

        val drawableResourceId = holder.itemView.context.resources.getIdentifier(item.pic, "drawable", holder.itemView.context.packageName)

        Glide.with(context)
            .load(drawableResourceId)
            .into(holder.binding.pic)
    }

    override fun getItemCount(): Int = items.size
}