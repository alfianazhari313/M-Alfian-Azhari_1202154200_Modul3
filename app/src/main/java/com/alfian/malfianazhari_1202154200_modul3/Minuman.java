package com.alfian.malfianazhari_1202154200_modul3;

import java.io.Serializable;

/**
 * Created by M. Alfian Azhari on 2/23/2018.
 */

public class Minuman implements Serializable{
    String merk,deskripsi;
    int foto;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Minuman(String merk, String deskripsi, int foto) {
        this.merk = merk;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
