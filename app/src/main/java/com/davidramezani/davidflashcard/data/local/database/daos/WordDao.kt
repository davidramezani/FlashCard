package com.davidramezani.davidflashcard.data.local.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.davidramezani.davidflashcard.data.local.database.entities.WordEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface WordDao {

    @Insert
    suspend fun insertWord(wordEntity: WordEntity)

    @Delete
    suspend fun deleteWord(wordEntity: WordEntity)

    @Query("SELECT * FROM word WHERE categoryId = :categoryId")
    fun getWordsByCategory(categoryId : Int) : Flow<List<WordEntity>>
}