package com.amirhusseinsoori.imageapp.api

import com.amirhusseinsoori.imageapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)