package com.njm.lazyapp.domain.model

data class ResultBySearchModel(
    val kind: String,
    val etag: String,
    val nextPageToken: String,
    val prevPageToken: String,
    val pageInfo: PageInfo,
    val items: List<Item>
)