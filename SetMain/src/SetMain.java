import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain<s> {

    public static void main(String[] args) {
        Set<String> set1  = new HashSet<String>();
        Set<String> set2  = new LinkedHashSet<String>();
        Set<String> set3  = new TreeSet<String>();
        //HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Js");
        set1.add("Php");
        //LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("Js");
        set2.add("Php");
        //TreeSet
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("Js");
        set3.add("Php");

        System.out.println("Hashset**************************");
        for(String s : set1){
            System.out.println(s);
        }

        System.out.println("\n"+"LinkedHashset**************************");
        for(String s : set1){
            System.out.println(s);
        }

        System.out.println("\n"+"Treeset**************************");
        for(String s : set1){
            System.out.println(s);
        }
    }
}
