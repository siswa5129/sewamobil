package com.example.siswa5129.kovenksi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by siswa5129 on 10/15/2017.
 */
public class LoginTest {
    @Test
    public void onCreate() throws Exception {
        String Email = "firman@gmail.com";
        String Password = "1234567890";
        Boolean loginexpected = true;

        Login signin = new Login();
        signin.signIn(Email, Password);
        //assertEquals(loginexpected);
    }

    @Test
    public void signIn() throws Exception {

    }

}