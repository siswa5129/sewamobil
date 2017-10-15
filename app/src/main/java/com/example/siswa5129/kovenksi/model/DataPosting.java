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

    public String getNamapesanan() {
        return namapesanan;
    }

    public void setNamapesanan(String namapesanan) {
        this.namapesanan = namapesanan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getCariasi() {
        return cariasi;
    }

    public void setCariasi(String cariasi) {
        this.cariasi = cariasi;
    }

    public String getWarnavariasi() {
        return warnavariasi;
    }

    public void setWarnavariasi(String warnavariasi) {
        this.warnavariasi = warnavariasi;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getTanggalselesai() {
        return tanggalselesai;
    }

    public void setTanggalselesai(String tanggalselesai) {
        this.tanggalselesai = tanggalselesai;
    }

    public String getDana() {
        return dana;
    }

    public void setDana(String dana) {
        this.dana = dana;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
