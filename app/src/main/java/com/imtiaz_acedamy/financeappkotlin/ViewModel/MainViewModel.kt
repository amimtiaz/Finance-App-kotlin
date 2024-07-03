package com.imtiaz_acedamy.financeappkotlin.ViewModel

import androidx.lifecycle.ViewModel
import com.imtiaz_acedamy.financeappkotlin.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())

    fun loadData() = repository.items
}