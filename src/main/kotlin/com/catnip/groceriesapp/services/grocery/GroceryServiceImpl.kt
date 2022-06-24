package com.catnip.groceriesapp.services.grocery

import com.catnip.groceriesapp.entity.grocery.Grocery
import com.catnip.groceriesapp.repository.grocery.GroceryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GroceryServiceImpl : GroceryService {

    @Autowired
    private lateinit var groceryRepository: GroceryRepository

    override fun getGroceries(): List<Grocery>? {
        return groceryRepository.getGroceries()
    }

    override fun getGroceryById(id: String): Grocery? {
        return groceryRepository.getGroceryById(id)
    }

    override fun getGroceriesByName(name: String): List<Grocery>? {
        return groceryRepository.getGroceriesByName(name)
    }

    override fun addGrocery(grocery: Grocery): Grocery? {
        return groceryRepository.addGrocery(grocery)
    }

    override fun deleteGrocery(groceryId: String): Grocery? {
        return groceryRepository.deleteGrocery(groceryId)
    }

    override fun updateGrocery(groceryId: String, grocery: Grocery): Grocery? {
        return groceryRepository.updateGrocery(groceryId, grocery)
    }
}