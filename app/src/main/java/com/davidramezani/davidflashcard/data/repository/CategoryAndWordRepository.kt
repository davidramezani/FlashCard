package com.davidramezani.davidflashcard.data.repository

import com.davidramezani.davidflashcard.domain.model.Category
import com.davidramezani.davidflashcard.domain.model.Word
import com.davidramezani.davidflashcard.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface CategoryAndWordRepository {
    fun getCategories() : Flow<List<Category>>
    fun getWords(categoryId : Int) : Flow<List<Word>>
    fun getWord(wordId : Int) : Word
    fun addCategory(category: Category)
    fun addWord(word: Word)
    fun fetchWordInfo(title : String) : Resource<Boolean>
}