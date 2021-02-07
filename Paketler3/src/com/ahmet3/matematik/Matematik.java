package com.ahmet3.matematik;


public class Matematik implements IMatematik {
    @Override
    public void tolama(int a, int b) {
        System.out.println("Toplama sonucu: " + (a+b) );
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Cikarma sonucu: " + (a-b) );
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Carpma sonucu: " + (a*b) );
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bolme sonucu: " + ((double) a/ b) );
    }
}
