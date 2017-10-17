package com.example.siswa5129.kovenksi.model;

import com.example.siswa5129.kovenksi.Akun;

/**
 * Created by siswa5129 on 9/30/2017.
 */

public class AkunKonsumen extends Akun{
    String idkonsumen;
    String namakonsumen;
    String emailkonsumen;
    String passwordkonsumen;
    String notelpkonsumen;
    String alamat;

    public AkunKonsumen(String idkonsumen, String namakonsumen, String emailkonsumen, String passwordkonsumen, String notelpkonsumen, String alamat) {
        this.idkonsumen = idkonsumen;
        this.namakonsumen = namakonsumen;
        this.emailkonsumen = emailkonsumen;
        this.passwordkonsumen = passwordkonsumen;
        this.notelpkonsumen = notelpkonsumen;
        this.alamat = alamat;
    }
}
