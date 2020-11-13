import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class demo06 {
    public static void main(String[] args) {
        String str = "dsgdfhgjhhgfdsasfdgfhggafsgdfhggdsfafdgfh";
//        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        TreeMap<Character, Integer> characterIntegerHashMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer integer = characterIntegerHashMap.get(c);
            if (integer == null) {
                characterIntegerHashMap.put(c, 1);
            } else {
                int value = characterIntegerHashMap.get(c) + 1;
                value++;
                characterIntegerHashMap.put(c, value);
            }

        }
        Set<Character> characters = characterIntegerHashMap.keySet();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c :
                characters) {
            stringBuilder.append(c).append("(").append(characterIntegerHashMap.get(c)).append(")").append(" ");
        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }
}
