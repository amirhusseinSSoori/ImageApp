package com.amirhusseinsoori.imageapp.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.amirhusseinsoori.imageapp.data.UnsplashRepository


class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {
}