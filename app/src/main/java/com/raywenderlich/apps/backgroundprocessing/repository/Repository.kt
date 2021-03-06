package com.raywenderlich.apps.backgroundprocessing.repository

import android.arch.lifecycle.LiveData

interface Repository {

    fun getPhotos(): LiveData<List<String>>

    fun getBanner(): LiveData<String>

    fun register()

    fun unregister()
}