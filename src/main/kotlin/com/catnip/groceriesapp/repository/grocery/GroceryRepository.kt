package com.catnip.groceriesapp.repository.grocery

import com.catnip.groceriesapp.entity.grocery.Grocery

interface GroceryRepository {
    fun getGroceries(): List<Grocery>?
    fun getGroceryById(id: String): Grocery?
    fun getGroceriesByName(name: String): List<Grocery>?
    fun addGrocery(grocery: Grocery): Grocery?
    fun deleteGrocery(groceryId: String): Grocery?
    fun updateGrocery(groceryId: String, grocery: Grocery): Grocery?
}