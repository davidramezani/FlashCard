package com.davidramezani.davidflashcard.data.local.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "word")
data class WordEntity(
    val id : Int,
    @ColumnInfo(name = "category_id")
    val categoryId : Int,
    val title : String,
    val meaning : String,
    val example : String,
    val pronunciation : String,
    val imgUrl : String,
    val extraLink : String
)