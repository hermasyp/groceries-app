package com.catnip.groceriesapp.component.db

import com.catnip.groceriesapp.entity.grocery.Grocery
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection
import org.springframework.stereotype.Component


@Component
class DatabaseComponent {
/*
    @Value("\${DATABASE_URL}")
    private lateinit var databaseUrl : String*/

    companion object{
        private const val DATABASE_URL = "mongodb+srv://hermasyuda:t6VWrtRBWihj8JNc@cluster0.pwcyn.mongodb.net/?retryWrites=true&w=majority"
    }

    private val database: MongoClient = KMongo.createClient(DATABASE_URL)

    fun groceriesCollection(): MongoCollection<Grocery> = database.getDatabase("groceries").getCollection()

}