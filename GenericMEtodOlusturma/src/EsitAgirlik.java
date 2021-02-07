public class EsitAgirlik extends Aday{

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puan_hesapla() {
        return (getTurkce()*5+ getMatematik()*5+getFizik()*1+getEdebiyat()*4);
    }


}
