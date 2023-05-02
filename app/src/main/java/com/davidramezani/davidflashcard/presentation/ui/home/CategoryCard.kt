package com.davidramezani.davidflashcard.presentation.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.davidramezani.davidflashcard.domain.model.Category

@Composable
fun CategoryCard(
    category: Category,
    onClick : () -> Unit
) {

}

@Preview
@Composable
fun PreCartCategoryCard() {
    val category = Category(
        id = 0,
        title = "public",
        wordCount = 25
    )
    CategoryCard(category = category) {

    }
}