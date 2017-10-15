package com.example.siswa5129.kovenksi.model;

import com.example.siswa5129.kovenksi.Akun;

/**
 * Created by siswa5129 on 9/30/2017.
 */

public class AkunKonveksi extends Akun{
    String id;
    String nama;
    String namakonveksi;
    String email;
    String password;
    String notelp;
    String alamatkonveksi;
    String nonpwp;
    String nosiup;

    public AkunKonveksi(String id, String nama, String namakonveksi, String email, String password, String notelp, String alamatkonveksi, String nonpwp, String nosiup) {

        this.id = id;
        this.nama = nama;
        this.namakonveksi = namakonveksi;
        this.email = email;
        this.password = password;
        this.notelp = notelp;
        this.alamatkonveksi = alamatkonveksi;
        this.nonpwp = nonpwp;
        this.nosiup = nosiup;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNamakonveksi() {
        return namakonveksi;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNotelp() {
        return notelp;
    }

    public String getAlamatkonveksi() {
        return alamatkonveksi;
    }

    public String getNonpwp() {
        return nonpwp;
    }

    public String getNosiup() {
        return nosiup;
    }
}
