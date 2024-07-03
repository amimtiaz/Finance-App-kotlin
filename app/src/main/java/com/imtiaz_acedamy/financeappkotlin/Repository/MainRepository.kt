package com.imtiaz_acedamy.financeappkotlin.Repository

import com.imtiaz_acedamy.financeappkotlin.Domain.BudgetDomain
import com.imtiaz_acedamy.financeappkotlin.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(

            ExpenseDomain( "Resturant", 573.12,  "img1",  "17 jun 2024 19:15"),
            ExpenseDomain( "McDonald",  77.82,  "img2", "16 jun 2024 13:57"),
            ExpenseDomain(  "Cinema", 23.47, "img3", "16 jun 2024 20:45"),
            ExpenseDomain ( "Resturant",  341.12, "img1",  "15 jun 2024 22:18")
    )

    val budget = mutableListOf(

        BudgetDomain("Resturant", 573.12,80.0),
        BudgetDomain("Subscription", 932.16,60.0),
        BudgetDomain("Car Loan", 632.16,63.0),

    )
}
