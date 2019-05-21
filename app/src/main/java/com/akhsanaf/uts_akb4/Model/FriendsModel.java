package com.akhsanaf.uts_akb4.Model;
/**
 * Nama : Akhsan Andara F
 * NIM : 10116160
 * Kelas : AKB 4
 * Waktu Pengerjaan : 15 Mei 2019
 */

public class FriendsModel {
    private String nim;
    private String nama;
    private String kelas;
    private String telephone;
    private String email;
    private String sosmed;



    public FriendsModel(String nim, String nama, String kelas, String telephone, String email, String sosmed) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.telephone = telephone;
        this.email = email;
        this.sosmed = sosmed;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    public String getKelas() {
        return kelas;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getEmail() {
        return email;
    }
    public String getSosmed() {
        return sosmed;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }


}
