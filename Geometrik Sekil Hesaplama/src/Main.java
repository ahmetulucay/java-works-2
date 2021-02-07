import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Geometrik Sekil Hesaplama

        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler ... \n"
                           + "1.Kare Alan Hesapla\n"
                           + "2.Ucgen Alan Hesapla\n"
                           + "3.Daire Alan Hesapla\n"
                           + "Cikis : q";
        while (true){
            System.out.println(islemler);
            System.out.println("Hangi Seklin Alanini Hesaplamak Istiyorsunuz : ");
            String sekilTuru = scanner.nextLine();
            Sekil sekil = null;

            if (sekilTuru.equals("q")){
                System.out.println("Programdan Cikiliyor..");
                break;
            }
            else if (sekilTuru.equals("1")){
                System.out.print("Karenin Kenari : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare ("Kare 1", kenar);
                sekil.alanHesapla();

            }
            else if (sekilTuru.equals("2")){
                System.out.print("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3);
                sekil.alanHesapla();
            }
            else if (sekilTuru.equals("3")) {
                System.out.print("Dairenin yaricapi : ");
                int ycap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire 1", ycap);
                sekil.alanHesapla();
            }
            else{
                System.out.println("Gecersiz bir islem...");
            }
        }
    }
}
