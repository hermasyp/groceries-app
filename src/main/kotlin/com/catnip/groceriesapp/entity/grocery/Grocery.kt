package com.catnip.groceriesapp.entity.grocery

import java.util.*

data class Grocery(
        var id: String = UUID.randomUUID().toString(),
        var name : String? = "",
        var price : Double? = 0.0,
        var gram : Double? = 0.0,
        var description : String? = ""
)