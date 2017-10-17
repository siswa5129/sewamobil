package com.example.siswa5129.kovenksi.model;

import com.example.siswa5129.kovenksi.Posting;

/**
 * Created by siswa5129 on 10/1/2017.
 */

public class DataPosting extends Posting{
    String id, namapesanan, jenis, warna, cariasi, warnavariasi, ukuran, tanggalselesai, dana, keterangan;

    public DataPosting(String id, String namapesanan, String jenis, String warna, String cariasi, String warnavariasi, String ukuran, String tanggalselesai, String dana, String keterangan) {
        this.id = id;
        this.namapesanan = namapesanan;
        this.jenis = jenis;
        this.warna = warna;
        this.cariasi = cariasi;
        this.warnavariasi = warnavariasi;
        this.ukuran = ukuran;
        this.tanggalselesai = tanggalselesai;
        this.dana = dana;
        this.keterangan = keterangan;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
