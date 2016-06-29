package com.epicodus.localbusiness;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.PositionAssertions.isBelow;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.assertion.ViewAssertions.selectedDescendantsMatch;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Guest on 6/29/16.
 */
public class MainActivityIntegrationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void SecondActivityLoads() {
        onView(withId(R.id.drinkButton)).perform(click());
        onView(withId(R.id.drinkMenu)).check(matches(withText("DRINK MENU")));
    }

    @Test
    public void FoodListIsBelowHeader(){
        onView(withId(R.id.foodButton)).perform(click());
        onView(withId(R.id.foodListView)).check(isBelow(withId(R.id.foodTextView)));
    }

}
