package com.amirhusseinsoori.imageapp.api

import com.codinginflow.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)