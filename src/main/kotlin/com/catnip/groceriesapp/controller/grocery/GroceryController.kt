package com.catnip.groceriesapp.controller.grocery

import com.catnip.groceriesapp.entity.grocery.Grocery
import com.catnip.groceriesapp.services.grocery.GroceryService
import com.catnip.groceriesapp.wrapper.BaseResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/grocery")
class GroceryController {

    @Autowired
    private lateinit var groceryService: GroceryService

    @GetMapping
    fun getGroceries(): BaseResponse<List<Grocery>> {
        return BaseResponse(true, message = "Success", data = groceryService.getGroceries())
    }

    @GetMapping("/{userId}")
    fun getGroceryByUserId(@PathVariable(value = "userId") userId: String): BaseResponse<Grocery> {
        return BaseResponse(true, message = "Success", data = groceryService.getGroceryById(userId))
    }

    @GetMapping("/filter")
    fun getGroceriesByName(@RequestParam(name = "name") name : String): BaseResponse<List<Grocery>> {
        return BaseResponse(true, message = "Success", data = groceryService.getGroceriesByName(name))
    }

    @PostMapping
    fun addGrocery(@RequestBody grocery: Grocery) : BaseResponse<Grocery>{
        return BaseResponse(true, message = "Success", data = groceryService.addGrocery(grocery))
    }

    @PutMapping("/{id}")
    fun updateGrocery(@PathVariable(value = "id") id: String,@RequestBody grocery: Grocery) : BaseResponse<Grocery>{
        return BaseResponse(true, message = "Success", data = groceryService.updateGrocery(id,grocery))
    }

    @DeleteMapping("/{id}")
    fun deleteGrocery(@PathVariable(value = "id") id: String) : BaseResponse<Grocery>{
        return BaseResponse(true, message = "Success", data = groceryService.deleteGrocery(id))
    }
}