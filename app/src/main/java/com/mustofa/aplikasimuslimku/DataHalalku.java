package com.mustofa.aplikasimuslimku;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataHalalku {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("nomor_sertifikat")
    @Expose
    private String nomor_sertifikat;

    @SerializedName("produsen")
    @Expose
    private String produsen;

    @SerializedName("berlaku_hingga")
    @Expose
    private String berlaku_hingga;

    public DataHalalku(String title, String nomor_sertifikat, String produsen, String berlaku_hingga) {
        this.title = title;
        this.nomor_sertifikat = nomor_sertifikat;
        this.produsen = produsen;
        this.berlaku_hingga = berlaku_hingga;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNomor_sertifikat() {
        return nomor_sertifikat;
    }

    public void setNomor_sertifikat(String nomor_sertifikat) {
        this.nomor_sertifikat = nomor_sertifikat;
    }

    public String getProdusen() {
        return produsen;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }

    public String getBerlaku_hingga() {
        return berlaku_hingga;
    }

    public void setBerlaku_hingga(String berlaku_hingga) {
        this.berlaku_hingga = berlaku_hingga;
    }
}
