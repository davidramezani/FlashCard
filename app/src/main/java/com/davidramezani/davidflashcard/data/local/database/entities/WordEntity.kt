package com.davidramezani.davidflashcard.data.local.database.entities

import androidx.room.Entity

@Entity(tableName = "word")
data class WordEntity(
    val id : Int,
    val categoryId : Int,
    val title : String,
    val meaning : String,
    val example : String,
    val pronunciation : String,
    val imgUrl : String,
    val extraLink : String
)