package com.example.siswa5129.kovenksi;

import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.BooleanResult;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Created by siswa5129 on 10/15/2017.
 */
@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.DEFAULT)
public class AkunTest {
    @Rule
    public ActivityTestRule<Login> loginActivityActivityTestRule = new ActivityTestRule<>(Login.class, true, false);

    private void pauseTestFor(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void enableData(Context context, boolean enable) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        try {
            Method m = cm.getClass().getDeclaredMethod("setMobileDataEnabled", boolean.class);
            m.invoke(cm, enable);
        } catch (Exception ignored) {
        }
    }

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    @After
    public void tearDown() throws Exception {
        Intents.release();
    }
}