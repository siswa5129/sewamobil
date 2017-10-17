package com.example.siswa5129.kovenksi;

import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by siswa5129 on 10/16/2017.
 */
public class MenuUtamaTest {



    public IntentsTestRule<MenuUtama> testintent = new IntentsTestRule<>(MenuUtama.class, true, false);

    private void pauseTestFor(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMenuPosting()throws Exception{
        testintent.launchActivity(null);
        onView(withId(R.id.button_posting)).perform(click());
        pauseTestFor(500);
        intended(hasComponent(Posting.class.getName()));
        Intents.release();
    }

    @Test
    public void testMenuProfil()throws Exception{
        testintent.launchActivity(null);
        onView(withId(R.id.button_profil)).perform(click());
        pauseTestFor(500);
        intended(hasComponent(Profil.class.getName()));
        Intents.release();
    }

    @Test
    public void testMenuPerjanjian()throws Exception{
        testintent.launchActivity(null);
        onView(withId(R.id.button_perjanjian)).perform(click());
        pauseTestFor(500);
        intended(hasComponent(Perjanjian.class.getName()));
        Intents.release();
    }

    @Test
    public void testMenuNegosiasi()throws Exception{
        testintent.launchActivity(null);
        onView(withId(R.id.button_negosiasi)).perform(click());
        pauseTestFor(500);
        intended(hasComponent(Negosiasi.class.getName()));
        Intents.release();
    }

    @Test
    public void testMenuPembayaran()throws Exception{
        testintent.launchActivity(null);
        onView(withId(R.id.button_bayar)).perform(click());
        pauseTestFor(500);
        intended(hasComponent(Pembayaran.class.getName()));
        Intents.release();
    }

    @Test
    public void testMenuRespon()throws Exception{
        testintent.launchActivity(null);
        onView(withId(R.id.button_pesanansaya)).perform(click());
        pauseTestFor(500);
        intended(hasComponent(Pesanan.class.getName()));
        Intents.release();
    }



}