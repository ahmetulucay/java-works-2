import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("CALISANLAR PROGRAMI'NA HOSGELDINIZ...");
        String islemler = "Islemler ....\n"
                        +"1.Yazilimci Islemleri\n"
                        +"2.Yonetici Islemleri\n"
                        +"Cikis icin q 'ya basin.";
        System.out.println("*******************************");
        System.out.println(islemler);
        System.out.println("*******************************");
        int hataliGiris =0;

        while (true){
            System.out.println("Islemi seciniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor...");
                break;
            }else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Ahmet", "Bey", 5046567, "Java, Python");
                String yazilimciIslem= "Yazilimci Islemleri= \n"
                                        +"1.Format At.\n"
                                        +"2.Bilgileri Goster.\n"
                                        +"Cikis icin q 'ya basin.";
                System.out.println(yazilimciIslem);
                while (true){
                    System.out.println("Yazilimci Islemi seciniz: ");
                    String yIslem= scanner.nextLine();

                    if (yIslem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        System.out.println("*************************");
                        break;
                    }
                    else if (yIslem.equals("1")){
                        yazilimci.formatAt("Windows");
                    }else if(yIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }else{
                        System.out.println("Hatali islem girisi yaptiniz.");
                    }
                }
            }else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Patron", "Bey", 00001, 20);
                String yoneticiIslem= "Yonetici Islemleri= \n"
                        +"1.Zam Yap.\n"
                        +"2.Bilgileri Goster.\n"
                        +"Cikis icin q 'ya basin.";
                while (true){
                    System.out.println("Yonetici Islemi seciniz: ");
                    String yIslem= scanner.nextLine();

                    if (yIslem.equals("q")){
                        System.out.println("Yonetici islemlerinden cikiliyor...");
                        System.out.println("*************************");
                        break;
                    }
                    else if (yIslem.equals("1")){
                        yonetici.zamYap(500);
                    }else if(yIslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }else{
                        System.out.println("Hatali islem girisi yaptiniz.");
                    }
                }
            }else {
                hataliGiris += 1;
                if (hataliGiris==3){
                    System.out.println("3 yanlis giris yaptiniz. Hoscakalin...");
                    break;
                }else {
                    System.out.println("Yanlis islem girisi yaptiniz, tekrar deneyiniz lutfen.");
                }
            }
        }
    }
}
