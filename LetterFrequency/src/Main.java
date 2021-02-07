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

    }
}
