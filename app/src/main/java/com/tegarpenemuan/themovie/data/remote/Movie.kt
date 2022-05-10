package com.tegarpenemuan.themovie.data.remote

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
    val id: String,
    val overview: String?,
    val poster_path: String,
    val original_title: String,
): Parcelable {
    val baseUrl get() = "https://image.tmdb.org/t/p/w500"
}