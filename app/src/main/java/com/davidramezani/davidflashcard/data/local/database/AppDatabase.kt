package com.davidramezani.davidflashcard.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.davidramezani.davidflashcard.data.local.database.daos.CategoryDao
import com.davidramezani.davidflashcard.data.local.database.daos.WordDao
import com.davidramezani.davidflashcard.data.local.database.entities.CategoryEntity
import com.davidramezani.davidflashcard.data.local.database.entities.WordEntity

@Database(entities = [WordEntity::class, CategoryEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wordDao() : WordDao
    abstract fun categoryDao() : CategoryDao
}