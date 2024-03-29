package com.example.firebasesample.data.models

// Firebase needs no arg constructor
data class User(
    val uid: String,
    val username: String,
    val profileImage: String,
    val animeFavorites: MutableMap<String, AnimePosterNode>,
    val animeWatched: MutableMap<String, AnimePosterNode>,
    val animeReviews: MutableMap<String, AnimeReview>
) {
    constructor() : this (
        uid = "",
        username = "",
        profileImage = "",
        animeFavorites = mutableMapOf(),
        animeWatched = mutableMapOf(),
        animeReviews = mutableMapOf()
    )
}