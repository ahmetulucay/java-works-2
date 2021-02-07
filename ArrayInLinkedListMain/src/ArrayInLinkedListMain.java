import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayInLinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        zamanHesapla("LinkedList", linkedList);
        zamanHesapla("ArrayList",  arrayList);
        zamanHesapla("ArrayList2", arrayList);

    }
    public static void zamanHesapla (String veriTipi, List<Integer> list){
        //Listin sonuna deger ekleme...
        long baslangic;
        long bitis;

        baslangic =System.currentTimeMillis();
        for (int i = 0; i <1000000; i++ ){
            list.add(0, i);
        }

        bitis = System.currentTimeMillis();

        System.out.println(veriTipi + " ekleme suresi = " + (bitis-baslangic)+ " ms.");
    }

}