package com.example.siswa5129.kovenksi;

import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import android.widget.EditText;

import com.example.siswa5129.kovenksi.model.AkunKonsumen;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Array;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by siswa5129 on 10/17/2017.
 */
@RunWith(JUnit4.class)
public class PendaftaranTest {

    @Rule
    public ActivityTestRule<Pendaftaran> daftartestrule = new ActivityTestRule<>(Pendaftaran.class, true, false);

    private void pauseTestFor(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ceknamadaftar() {
        daftartestrule.launchActivity(null);
        onView(withId(R.id.namakonsumen)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.btnDaftarkonsumen)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.namakonsumen)).check(matches(hasErrorText("Mohon Diisi")));
    }

    @Test
    public void cekemaildaftar() {
        daftartestrule.launchActivity(null);
        onView(withId(R.id.namakonsumen)).perform(typeText("firman"),closeSoftKeyboard());
        onView(withId(R.id.emailkonsumen)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.btnDaftarkonsumen)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.emailkonsumen)).check(matches(hasErrorText("Mohon Diisi")));
    }

    @Test
    public void cekpassworddaftar() {
        daftartestrule.launchActivity(null);
        onView(withId(R.id.namakonsumen)).perform(typeText("firman"),closeSoftKeyboard());
        onView(withId(R.id.emailkonsumen)).perform(typeText("firman"),closeSoftKeyboard());
        onView(withId(R.id.passwordkonsumen)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.btnDaftarkonsumen)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.passwordkonsumen)).check(matches(hasErrorText("Mohon Diisi")));
    }

    @Test
    public void ceknotelpdaftar() {
        daftartestrule.launchActivity(null);
        onView(withId(R.id.namakonsumen)).perform(typeText("firman"),closeSoftKeyboard());
        onView(withId(R.id.emailkonsumen)).perform(typeText("firman"),closeSoftKeyboard());
        onView(withId(R.id.passwordkonsumen)).perform(typeText("123456"),closeSoftKeyboard());
        onView(withId(R.id.notelpkonsumen)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.btnDaftarkonsumen)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.notelpkonsumen)).check(matches(hasErrorText("Mohon Diisi")));
    }

    @Test
    public void cekalamatdaftar() {
        daftartestrule.launchActivity(null);
        onView(withId(R.id.namakonsumen)).perform(typeText("firman"),closeSoftKeyboard());
        onView(withId(R.id.emailkonsumen)).perform(typeText("firman"),closeSoftKeyboard());
        onView(withId(R.id.passwordkonsumen)).perform(typeText("123456"),closeSoftKeyboard());
        onView(withId(R.id.notelpkonsumen)).perform(typeText("411329"),closeSoftKeyboard());
        onView(withId(R.id.alamatkonsumen)).perform(typeText(""),closeSoftKeyboard());
        onView(withId(R.id.btnDaftarkonsumen)).perform(click());
        pauseTestFor(500);
        onView(withId(R.id.alamatkonsumen)).check(matches(hasErrorText("Mohon Diisi")));
    }




}