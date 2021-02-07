public class StaticClass {
    public static int obje_Sayisi = 0;
    private static String isim ;

    public StaticClass(String isim){
        obje_Sayisi ++;
    }
    public static String getIsim(){
        return isim;
    }
}
