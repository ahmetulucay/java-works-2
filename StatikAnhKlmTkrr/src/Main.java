public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        StaticClass s1 = new StaticClass("Murat");
        StaticClass s2 = new StaticClass("Mehmet");

        System.out.println("Obje Sayisi = " + StaticClass.obje_Sayisi);
        System.out.println("Obje Sayisi = " + s1.obje_Sayisi );
        System.out.println("Obje Sayisi = " + s2.obje_Sayisi );

        Main c1 = new Main();
        c1.toplama(3,4,5); // Main classiyla object cagirmadan sadece "toplama (3+4+5);" metodunu yazsaydik,
                                     // asagidaki toplama metodunu da "static void toplama (int a, int b, int c )"
                                     // olarak degistirmek zorunda kalacaktik.
    }

    public void toplama (int a, int b, int c ) {
        System.out.println(a+b+c);
    }
}
