package com.njm.lazyapp.domain.model

import java.util.*

data class Snippet(
    val publishedAt: Date,
    val channelId: String,
    val title: String,
    val description: String,
    val thumbnails: Thumbnails,
    val channelTitle: String
)