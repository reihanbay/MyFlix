package com.dicoding.submission.myapplication.view

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.submission.myapplication.R
import com.dicoding.submission.myapplication.utils.DummyData
import com.dicoding.submission.myapplication.viewmodel.MoviesViewModel
import org.junit.Assert.*

import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val dummy = DummyData.getDataFilm()
    private val dataMovies = MoviesViewModel().getListMovies()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withText("Movies")).perform(click())
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummy.size))

        onView(withText("TV Shows")).perform(click())
        onView(withId(R.id.rv_tv_shows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_shows)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummy.size))
    }

    @Test
    fun loadDetailFilm() {
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_value_star)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_value_star)).check(matches(withText(dataMovies[0].rate.toString())))
        onView(withId(R.id.tv_value_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_value_duration)).check(matches(withText("${dataMovies[0].time.toString()} Hours")))
        onView(withId(R.id.tv_value_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_value_genre)).check(matches(withText(dataMovies[0].genre)))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dataMovies[0].title)))
        onView(withId(R.id.tv_summary)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_back)).perform(click())
    }

}