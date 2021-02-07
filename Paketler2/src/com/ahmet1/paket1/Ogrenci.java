package com.ahmet1.paket1;

import com.ahmet1.paket2.AdayOgrenci;

import  com.ahmet1.paket1.Ogrenci;

public class Ogrenci implements AdayOgrenci {
    @Override
    public void ders_calis() {
        System.out.println("Ders Calisiyorum...");
    }
}
