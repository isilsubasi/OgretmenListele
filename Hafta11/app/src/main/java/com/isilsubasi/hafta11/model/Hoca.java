package com.isilsubasi.hafta11.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hoca {

    @SerializedName("AdiSoyadi")
    @Expose
    private String adiSoyadi;
    @SerializedName("Eposta")
    @Expose
    private String eposta;
    @SerializedName("ResimURL")
    @Expose
    private String resimURL;
    @SerializedName("Verdi\u011fiDers")
    @Expose
    private String verdiIDers;

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getResimURL() {
        return resimURL;
    }

    public void setResimURL(String resimURL) {
        this.resimURL = resimURL;
    }

    public String getVerdiIDers() {
        return verdiIDers;
    }

    public void setVerdiIDers(String verdiIDers) {
        this.verdiIDers = verdiIDers;
    }
}
