import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("YGS LYS Birinci Bulma Programi...");
        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler...\n"
                +"1.Esit Agirlik Ogrencileri Birincisi\n"
                +"2.Sayisal Ogrencileri Birincisi"
                +"Cikis : q";
        System.out.println("*********************************");
        System.out.println(islemler);
        System.out.println("*********************************");


        while (true){
            System.out.println("Cikis icin q'ya basin... ");
            String cevap = scanner.nextLine();

            if (cevap.equals("q")){
                System.out.println("Programdan cikiliyor..");
                break;
            }
            //Birinci Ogrenci
            System.out.println("Birinci Ogrenci Ismi: ");
            String isim1 =scanner.nextLine();
            System.out.println("Netler(Turkce, Matematik, Edebiyat, Fizik) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();

            //Ikinci Ogrenci
            System.out.println("Ikinci Ogrenci Ismi: ");
            String isim2 =scanner.nextLine();
            System.out.println("Netler(Turkce, Matematik, Edebiyat, Fizik) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();

            //Ucuncu Ogrenci
            System.out.println("Ucuncu Ogrenci Ismi: ");
            String isim3 =scanner.nextLine();
            System.out.println("Netler(Turkce, Matematik, Edebiyat, Fizik) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Bir islem seciniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor..");
                break;
            }
            else if (islem.equals("1")){
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);

                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);

                System.out.println("Birinci Esit Agirlik Ogrencisi : " + birinci.getIsim());
                System.out.println("Ogrencinin Puani : " + birinci.puan_hesapla());
            }
            else if (islem.equals("2")){
                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);

                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);

                System.out.println("Birinci Sayisal Ogrencisi : "+ birinci.getIsim());
                System.out.println("Ogrencinin Puani : " + birinci.puan_hesapla());
            }
            else{
                System.out.println("Yanlis islem girdiniz. Tekrar deneyiniz.");
            }

        }

    }

    public static <E extends Aday> E birinci(E e1, E e2, E e3) {
        if ((e1.puan_hesapla() > e2.puan_hesapla()) &&(e1.puan_hesapla() > e3.puan_hesapla())) {
            return e1;
        }
        else if ((e2.puan_hesapla() > e1.puan_hesapla()) &&(e2.puan_hesapla() > e3.puan_hesapla())) {
            return e2;
        }
        else if ((e3.puan_hesapla() > e2.puan_hesapla()) &&(e3.puan_hesapla() > e3.puan_hesapla())) {
            return e3;
        }
        else{
            return e1;
        }
    }
}
