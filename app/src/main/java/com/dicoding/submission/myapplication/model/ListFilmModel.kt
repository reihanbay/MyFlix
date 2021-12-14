package com.dicoding.submission.myapplication.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListFilmModel(
    var type : String,
    var code : String,
    var title: String,
    var rate : Double,
    var img : String,
    var time : Int,
    var author : String,
    var genre : String
) : Parcelable
