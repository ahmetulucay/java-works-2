import java.util.HashSet;
import java.util.Set;

public class SetFark<s> {

    public static void main(String[] args) {
        Set<String> set1  = new HashSet<String>();
        Set<String> set2  = new HashSet<String>();

        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Js");
        set1.add("Php");

        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");

        //removeAll ----------
        //farklari bulur. set2'den set1'leri cikarip kalan Kalan Yalin set2'yi gosterir.
        Set<String> fark = new HashSet<String>(set2);
        System.out.println(fark.removeAll(set1));
        System.out.println(fark +"\n");

        //retainAll ----------
        //kesisimleri bulur. set2 ile set1 ortak olanleri bulup Kesisen set2'yi gosterir.
        Set<String> kesisim = new HashSet<String>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
    }
}