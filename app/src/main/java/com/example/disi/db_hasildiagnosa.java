package com.example.disi;

public class db_hasildiagnosa {
    private String nim;
    private String nama;
    private String jk;
    private String jurusan;
    private String instansi;
    private String jenisDepresi;


    public db_hasildiagnosa() {
        // Diperlukan konstruktor kosong untuk Firebase
    }

    public db_hasildiagnosa(String nim, String nama, String jk, String jurusan, String instansi, String jenisDepresi) {
        this.nim = nim;
        this.nama = nama;
        this.jk = jk;
        this.jurusan = jurusan;
        this.instansi = instansi;
        this.jenisDepresi = jenisDepresi;

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    public String getJenisDepresi() {
        return jenisDepresi;
    }

    public void setJenisDepresi(String jenisDepresi) {
        this.jenisDepresi = jenisDepresi;
    }
}
