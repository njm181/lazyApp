package com.njm.lazyapp.domain.model

data class Item(
    val kind: String,
    val etag: String,
    val id: Id,
    val snippet: Snippet
)