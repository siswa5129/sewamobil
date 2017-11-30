package com.example.siswa5129.sewamobil;

import android.support.test.rule.ActivityTestRule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by siswa5129 on 10/18/2017.
 */
@RunWith(JUnit4.class)
public class ProfilTest {
    public ActivityTestRule<Akun> logouttest = new ActivityTestRule<>(Akun.class, true, false);
    public ActivityTestRule<MenuUtama> menuutama = new ActivityTestRule<>(MenuUtama.class, true, false);
    public ActivityTestRule<Profil> profil = new ActivityTestRule<>(Profil.class, true, false);



    private void pauseTestFor(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cekLogoutSukses() {
        logouttest.launchActivity(null);
        onView(withId(R.id.et_email)).perform(typeText("firman@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.et_password)).perform(typeText("1234567890"),closeSoftKeyboard());
        onView(withId(R.id.bt_signin)).perform(click());
        menuutama.launchActivity(null);
        onView(withId(R.id.button_profil)).perform(click());
        profil.launchActivity(null);
        onView(withId(R.id.btnKeluar)).perform(click());
    }

}