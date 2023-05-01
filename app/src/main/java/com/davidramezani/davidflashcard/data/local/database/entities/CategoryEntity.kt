package com.davidramezani.davidflashcard.data.local.database.entities

import androidx.room.Entity

@Entity(tableName = "category")
data class CategoryEntity(
    val id : Int,
    val title : String,
    val imgUrl : String
)
