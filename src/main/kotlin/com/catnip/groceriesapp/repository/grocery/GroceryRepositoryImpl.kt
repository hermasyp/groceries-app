package com.catnip.groceriesapp.repository.grocery

import com.catnip.groceriesapp.component.db.DatabaseComponent
import com.catnip.groceriesapp.entity.grocery.Grocery
import org.litote.kmongo.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class GroceryRepositoryImpl : GroceryRepository {

    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    override fun getGroceries(): List<Grocery>? {
        return databaseComponent.groceriesCollection().find().toList()
    }

    override fun getGroceryById(id: String): Grocery? {
        return databaseComponent.groceriesCollection().findOne(Grocery::id eq id)
    }

    override fun getGroceriesByName(name: String): List<Grocery>? {
        return databaseComponent.groceriesCollection().find(Grocery::name regex ".*$name.*").toList()
    }

    override fun addGrocery(grocery: Grocery): Grocery? {
        val insertAction = databaseComponent.groceriesCollection().insertOne(grocery)
        if (insertAction.wasAcknowledged()) {
            return grocery
        } else {
            throw IllegalStateException("Insertion Failed $grocery")
        }
    }

    override fun deleteGrocery(groceryId: String): Grocery? {
        return databaseComponent.groceriesCollection().findOneAndDelete(Grocery::id eq groceryId)
    }

    override fun updateGrocery(groceryId: String, grocery: Grocery): Grocery? {
        return databaseComponent.groceriesCollection().findOneAndUpdate(Grocery::id eq groceryId,
                set(Grocery::gram setTo grocery.gram, Grocery::name setTo grocery.name, Grocery::description setTo grocery.description, Grocery::price setTo grocery.price))
    }
}