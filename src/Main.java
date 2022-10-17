import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
            " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim " +
            "ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip " +
            "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate" +
            " velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
            "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> symbols = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (symbols.containsKey(s)){
                int val = symbols.get(s) + 1;
                symbols.put(s, val);
                continue;
            }
            symbols.put(s,1);
        }

        int max = -1;
        int min = Integer.MAX_VALUE;
        for (char s : symbols.keySet()){
            if (symbols.get(s) > max) {
                max = symbols.get(s);
            }
            if (symbols.get(s) < min) {
                min = symbols.get(s);
            }
        }
        System.out.println("Максимум: " + max + " | Минимум: " + min);
    }
}