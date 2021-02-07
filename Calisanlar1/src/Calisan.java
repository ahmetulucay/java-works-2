public class Calisan {

    private String ad;
    private String soyad;
    private int Id;

    public Calisan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        Id = id;
    }

    public void bilgileriGoster(){
        System.out.println("Calisan Bilgileri=");
        System.out.println("Adi   : "+ad);
        System.out.println("Soyadi: "+soyad);
        System.out.println("Id'si : "+Id);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
