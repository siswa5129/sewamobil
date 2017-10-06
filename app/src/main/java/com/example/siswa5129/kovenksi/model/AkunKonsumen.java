package com.example.siswa5129.kovenksi.model;

/**
 * Created by siswa5129 on 9/30/2017.
 */

public class AkunKonsumen {
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

    public String getIdkonsumen() {
        return idkonsumen;
    }

    public String getNamakonsumen() {
        return namakonsumen;
    }

    public String getEmailkonsumen() {
        return emailkonsumen;
    }

    public String getPasswordkonsumen() {
        return passwordkonsumen;
    }

    public String getNotelpkonsumen() {
        return notelpkonsumen;
    }

    public String getAlamat() {
        return alamat;
    }
}

