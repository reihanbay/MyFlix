package com.dicoding.submission.myapplication.viewmodel

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class TvShowsViewModelTest {
    private lateinit var vm : TvShowsViewModel

    @Before
    fun setUp() {
        vm = TvShowsViewModel()
    }

    @Test
    fun getListTvShows() {
        val dataTvShows = vm.getListTvShows()
        assertNotNull(dataTvShows) //Memastikan data Movies tidak null.
        assertEquals(10, dataTvShows.size) //Memastikan jumlah data Movies sesuai dengan yang diharapkan.
    }
}