package com.dicoding.submission.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.submission.myapplication.model.ListFilmModel
import com.dicoding.submission.myapplication.utils.DummyData

class MoviesViewModel: ViewModel() {

    fun getListMovies() : List<ListFilmModel> {
        val listMovies = ArrayList<ListFilmModel>()
        val list = DummyData.getDataFilm()
        for (i in list){
            if (i.type == "mov") {
                listMovies.add(i)
            }
        }
        return listMovies
    }

}