public class Kopek extends Hayvan {

    private int disSayisi;

    public Kopek(String isim, int kilo, int boy, int bacak_sayisi, int disSayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.disSayisi =disSayisi;
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }

    public void hareketeGec(int hiz){
        System.out.println(getIsim()+ " saatte "+hiz+" km hizla hareket ediyor.");
    }

    public void kos (int hiz){
        System.out.println("Kopek kosmaya basladi.");
        hareketeGec(hiz);
    }
}
