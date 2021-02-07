public class Yonetici extends Calisan {  //subclass

    private int sorumlu_kisi;

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;
    }

    public void zam_yap (int zam_miktari){
        System.out.println("Calisanlara "+ zam_miktari+" TL zam yapildi.");
    }

    public void bilgileriGoster(){
        /*System.out.println("Isim: "+ getIsim());
        System.out.println("Maas: "+ getMaas());
        System.out.println("Departman: "+ getDepartman());*/

        super.bilgileriGoster(); // Yukaridaki 3 satiri da, miras aldigim class tan 'super' metoduyla cagirabilirim.

        System.out.println("Sorumlu Kisi: "+this.sorumlu_kisi);
    }

}

