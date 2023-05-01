package com.davidramezani.davidflashcard.data.local.database.entities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "category",
    foreignKeys = [
        ForeignKey(
            entity = WordEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("category_id"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class CategoryEntity(
    val id : Int,
    val title : String,
    val imgUrl : String
)
