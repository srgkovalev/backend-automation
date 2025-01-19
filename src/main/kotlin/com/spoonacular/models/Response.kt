package org.example.com.spoonacular.models

data class Response(
    val results: List<Result>,
    val offset: Int,
    val number: Int,
    val totalResults: Int
)

data class Result(
    val id: Int,
    val title: String,
    val image: String,
    val imageType: String
)
