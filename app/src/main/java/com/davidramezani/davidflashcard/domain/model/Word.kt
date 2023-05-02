package com.davidramezani.davidflashcard.domain.model

data class Word(
    val id : Int,
    val categoryId : Int,
    val categoryTitle : String,
    val title : String,
    val meaning : String,
    val example : String,
    val pronunciation : String,
    val imgUrl : String,
    val extraLink : String
)
