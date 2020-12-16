package com.amirhusseinsoori.imageapp.data

import com.amirhusseinsoori.imageapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}