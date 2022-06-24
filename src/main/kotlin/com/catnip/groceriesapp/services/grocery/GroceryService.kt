package com.catnip.groceriesapp.services.grocery

import com.catnip.groceriesapp.entity.grocery.Grocery

interface GroceryService {
    fun getGroceries(): List<Grocery>?
    fun getGroceryById(id: String): Grocery?
    fun getGroceriesByName(name: String): List<Grocery>?
    fun addGrocery(grocery: Grocery): Grocery?
    fun deleteGrocery(groceryId: String): Grocery?
    fun updateGrocery(groceryId: String, grocery: Grocery): Grocery?
}