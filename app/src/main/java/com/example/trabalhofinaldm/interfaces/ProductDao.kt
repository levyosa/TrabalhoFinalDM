package com.example.trabalhofinaldm.interfaces

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.trabalhofinaldm.models.Product

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    fun getAll(): List<Product>

    @Insert
    fun insert(product: Product)

    @Delete
    fun delete(product: Product)



}