package com.example.dinar.crudmahasiswaik3b.model;

//kelas pojo
public class Mahasiswa {
    private String nama, nim, email, foto;

    public Mahasiswa(){

    }

    public Mahasiswa(String nama, String nim, String email, String foto) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.foto = foto;
    }

    //mendapatkan variable nama
    public String getNama() {
        return nama;
    }

    //mengisi variable nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mendapatkan variable nim
    public String getNim() {
        return nim;
    }

    //mengisi variable nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    //mendapatkan variable email
    public String getEmail() {
        return email;
    }

    //mengisi variable email
    public void setEmail(String email) {
        this.email = email;
    }

    //mendapatkan variable foto
    public String getFoto() {
        return foto;
    }

    //mengisi variable foto
    public void setFoto(String foto) {
        this.foto = foto;
    }
}
