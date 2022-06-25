package com.catnip.groceriesapp.component.db

import com.catnip.groceriesapp.entity.grocery.Grocery
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection
import org.springframework.stereotype.Component


@Component
class DatabaseComponent {


    private val databaseUrl = System.getenv("DATABASE_URL")
    private val database: MongoClient = KMongo.createClient(databaseUrl)

    fun groceriesCollection(): MongoCollection<Grocery> = database.getDatabase("groceries").getCollection()

}