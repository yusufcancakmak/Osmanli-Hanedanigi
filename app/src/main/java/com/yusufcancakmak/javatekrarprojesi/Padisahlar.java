package com.yusufcancakmak.javatekrarprojesi;

public class Padisahlar {
    private int padi_id;
    private String padi_ad;
    private int padi_yas;
    private String padi_acıklama;
    private String padi_resim;

    public Padisahlar(int padi_id, String padi_ad, int padi_yas, String padi_acıklama, String padi_resim) {
        this.padi_id = padi_id;
        this.padi_ad = padi_ad;
        this.padi_yas = padi_yas;
        this.padi_acıklama = padi_acıklama;
        this.padi_resim = padi_resim;
    }

    public int getPadi_id() {
        return padi_id;
    }

    public void setPadi_id(int padi_id) {
        this.padi_id = padi_id;
    }

    public String getPadi_ad() {
        return padi_ad;
    }

    public void setPadi_ad(String padi_ad) {
        this.padi_ad = padi_ad;
    }

    public int getPadi_yas() {
        return padi_yas;
    }

    public void setPadi_yas(int padi_yas) {
        this.padi_yas = padi_yas;
    }

    public String getPadi_acıklama() {
        return padi_acıklama;
    }

    public void setPadi_acıklama(String padi_acıklama) {
        this.padi_acıklama = padi_acıklama;
    }

    public String getPadi_resim() {
        return padi_resim;
    }

    public void setPadi_resim(String padi_resim) {
        this.padi_resim = padi_resim;
    }
}
