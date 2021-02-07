import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Letter Frequency counting

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumleyi giriniz: ");
        String cumle = scanner.nextLine();
        Map<Character, Integer> frequency = new TreeMap<Character, Integer>();

        for (int i = 0; i< cumle.length();i++){
            char c = cumle.charAt(i);

            if (frequency.containsKey(c)){
                frequency.replace(c, frequency.get(c)+1);
            }
            else{
                frequency.put(c, 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()){
            System.out.println("Character: " +entry.getKey()+ " "+ entry.getValue()+" times repeating.");
        }

                /*
        List<String> list_string = new ArrayList<String>();

        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");

        Collections.sort(list_string);

        for(String s : list_string){
            System.out.println(s);
        }
        */


    }
}

