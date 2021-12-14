package com.dicoding.submission.myapplication.viewmodel

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class MoviesViewModelTest {
    private lateinit var vm : MoviesViewModel

    @Before
    fun setUp(){
        vm = MoviesViewModel()
    }

    @Test
    fun getListMovies() {
        val list = vm.getListMovies()
        assertNotNull(list) //Memastikan data Movies tidak null.
        assertEquals(10, list.size) //Memastikan jumlah data Movies sesuai dengan yang diharapkan.

    }
}