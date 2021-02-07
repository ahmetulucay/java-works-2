import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void mapYazdir(Map<Integer,String> map){
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key :" + entry.getKey()+ "Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String > hashmap = new HashMap<Integer, String>();
        Map<Integer, String > linkedhashmap = new LinkedHashMap<Integer, String>();
        Map<Integer, String > treemap = new TreeMap<Integer, String>();

        System.out.println("**********************");
        mapYazdir(hashmap);
        System.out.println("**********************");
        mapYazdir(linkedhashmap);
        System.out.println("**********************");
        mapYazdir(treemap);


    }
}
