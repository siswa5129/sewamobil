package com.example.siswa5129.kovenksi;

import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.widget.Toast;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;

@RunWith(JUnit4.class)
public class AkunTest {

    @Rule
    public ActivityTestRule<Akun> logintestrule = new ActivityTestRule<>(Akun.class, true, false);

    private void pauseTestFor(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cekEmailLogin() {
        logintestrule.launchActivity(null);
        onView(withId(R.id.et_email)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.bt_signin)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.et_email)).check(matches(hasErrorText("Masukkan Email")));
    }

    @Test
    public void cekPasswordLogin() {
        logintestrule.launchActivity(null);
        onView(withId(R.id.et_email)).perform(typeText("firman@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.et_password)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.bt_signin)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.et_password)).check(matches(hasErrorText("Masukkan Password")));
    }

    @Test
    public void cekEmailDaftar() {
        logintestrule.launchActivity(null);
        onView(withId(R.id.btnBuatAkun)).perform(click());
        onView(withId(R.id.ett_email)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.bt_signup)).perform(click());
        pauseTestFor(5000);
        onView(withId(R.id.ett_email)).check(matches(hasErrorText("Masukkan Email")));
    }

    @Test
    public void cekPasswordDaftar() {
        logintestrule.launchActivity(null);
        onView(withId(R.id.btnBuatAkun)).perform(click());
        onView(withId(R.id.ett_email)).perform(typeText("firman@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.ett_password)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.bt_signup)).perform(click());
        pauseTestFor(5000);
        onView(withId(R.id.ett_password)).check(matches(hasErrorText("Masukkan Password")));
    }
/*
    @Test
    public void cekloginsukses() {
        logintestrule.launchActivity(null);
        onView(withId(R.id.et_email)).perform(typeText("firman@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.et_password)).perform(typeText("1234567890"),closeSoftKeyboard());
        onView(withId(R.id.bt_signin)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.pesan)).check(withText("Login Berhasil"));
    }*/

    @Test
    public void ceklogingagal() {
        Akun tester = new Akun();

        //assertEquals("Result", result, tester.signIn("firman@gmail.com", "1234567890"););

    }



}