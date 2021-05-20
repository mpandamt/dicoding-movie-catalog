package com.pandam.moviecatalog.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.ViewPagerActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.pandam.moviecatalog.R
import com.pandam.moviecatalog.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val dummyMovie = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        onView(withId(R.id.text_movie_title))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_movie_title))
            .check(ViewAssertions.matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.text_release))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_release))
            .check(ViewAssertions.matches(withText(dummyMovie[0].release_date)))
        onView(withId(R.id.text_vote))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_vote))
            .check(ViewAssertions.matches(withText(dummyMovie[0].vote_average.toString())))
        onView(withId(R.id.text_vote_count))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_vote_count))
            .check(ViewAssertions.matches(withText(dummyMovie[0].vote_count.toString())))
        onView(withId(R.id.text_overview))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_overview))
            .check(ViewAssertions.matches(withText(dummyMovie[0].overview)))
        onView(withId(R.id.text_adult))
            .check(ViewAssertions.matches(withText("Adult")))
    }

    @Test
    fun loadTvShow() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.rv_tv_show))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToLast());
        onView(withId(R.id.rv_tv_show)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        onView(withId(R.id.text_tv_title))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_tv_title))
            .check(ViewAssertions.matches(withText(dummyTvShow[0].name)))
        onView(withId(R.id.text_first_air))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_first_air))
            .check(ViewAssertions.matches(withText(dummyTvShow[0].first_air_date)))
        onView(withId(R.id.text_vote))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_vote))
            .check(ViewAssertions.matches(withText(dummyTvShow[0].vote_average.toString())))
        onView(withId(R.id.text_vote_count))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_vote_count))
            .check(ViewAssertions.matches(withText(dummyTvShow[0].vote_count.toString())))
        onView(withId(R.id.text_overview))
            .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.text_overview))
            .check(ViewAssertions.matches(withText(dummyTvShow[0].overview)))
    }
}