package com.pandam.moviecatalog.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.ViewPagerActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.pandam.moviecatalog.R
import com.pandam.moviecatalog.utils.DataDummy
import com.pandam.moviecatalog.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val dummyMovie = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        IdlingRegistry.getInstance()
            .register(EspressoIdlingResource.getEspressoIdlingResourceForMainActivity())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance()
            .unregister(EspressoIdlingResource.getEspressoIdlingResourceForMainActivity())
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie))
            .check(matches(isDisplayed()))
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
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_movie_title))
            .check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.text_release))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_release))
            .check(matches(withText(dummyMovie[0].release_date)))
        onView(withId(R.id.text_vote))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_vote))
            .check(matches(withText(dummyMovie[0].vote_average.toString())))
        onView(withId(R.id.text_vote_count))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_overview))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_overview))
            .check(matches(withText(dummyMovie[0].overview)))
        onView(withId(R.id.text_adult))
            .check(matches(withText("Adult")))
    }

    @Test
    fun loadTvShow() {
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.rv_tv_show))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToPage(1));
        onView(withId(R.id.rv_tv_show)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                ViewActions.click()
            )
        )
        onView(withId(R.id.text_tv_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_tv_title))
            .check(matches(withText(dummyTvShow[0].name)))
        onView(withId(R.id.text_first_air))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_first_air))
            .check(matches(withText(dummyTvShow[0].first_air_date)))
        onView(withId(R.id.text_vote))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_vote))
            .check(matches(withText(dummyTvShow[0].vote_average.toString())))
        onView(withId(R.id.text_vote_count))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_vote_count))
            .check(matches(withText(dummyTvShow[0].vote_count.toString())))
        onView(withId(R.id.text_overview))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_overview))
            .check(matches(withText(dummyTvShow[0].overview)))
    }

    @Test
    fun loadFavMovies() {
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToPage(2));
        onView(withId(R.id.rv_movie))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadFavTvShows() {
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToPage(3));
        onView(withId(R.id.rv_tv_show))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun addFavoriteMovie() {
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToPage(0));
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.action_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToPage(2))
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.text_movie_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_release))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_vote))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_vote_count))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_overview))
            .check(matches(isDisplayed()))
        onView(withId(R.id.action_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
    }

    @Test
    fun addFavoriteTvShow() {
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToPage(1));
        onView(withId(R.id.rv_tv_show)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.action_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.view_pager)).perform(ViewPagerActions.scrollToPage(3))
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.text_tv_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_first_air))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_vote))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_vote_count))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_overview))
            .check(matches(isDisplayed()))
        onView(withId(R.id.action_favorite)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack())
    }
}