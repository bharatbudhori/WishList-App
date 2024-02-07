package com.example.mywishlistapp.data

import androidx.room.Database

@Database(entities = [Wish::class], version = 1, exportSchema = false)
abstract class WishDatabase {

}