import java.util.HashMap;
import java.util.Map;

/**
 * Created by rakeshg on 7/13/16.
 */
public class FirstNonRepeatedCharInString {

    public static void main(String[] args) {
        firstNonRepeatedString("Infoconnect");
    }

    /**
     *
     * @param word
     */
    // Logic for finding first NonRepeated String
    private static void firstNonRepeatedString(String word) {

        String lowerWord = word.toLowerCase();

        Map<Character, Integer> map = splitStringToMap(lowerWord);

        for (int i = 0; i <= lowerWord.length() - 1; i++) {
            char letter = lowerWord.charAt(i);
            if (map.get(letter) == 1) {
                System.out.println(letter);
                break;
            }
        }
    }

    /**
     *
     * @param word : this string is converted to hasMap depending on the count of occurrence of each letter.
     * @return map: The map contains detail information about the occurrence of each letter from the input string
     */

    protected static Map<Character, Integer> splitStringToMap(String word) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < word.length() - 1; i++) {
            char ch = word.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
