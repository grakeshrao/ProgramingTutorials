import java.util.HashMap;
import java.util.Map;

/**
 * Created by rakeshg on 7/13/16.
 */
public class FirstNonRepeatedCharInString {

    public void firstNonRepeatedString(String word) {

        String lowerWord = word.toLowerCase();

        Map<Character, Integer> map = splitStringToMap(lowerWord);

        for ( int i = 0; i <= lowerWord.length()-1; i++) {
            char letter = lowerWord.charAt(i);
            if (map.get(letter) == 1) {
                System.out.println(letter);
                break;
            }
        }
    }

    protected Map<Character, Integer> splitStringToMap(String word) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i=0; i < word.length() - 1; i++) {
            char ch = word.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch,1);
            }
        }
        return map;
    }


    public static void main (String[] args) {
        FirstNonRepeatedCharInString fn = new FirstNonRepeatedCharInString();
        fn.firstNonRepeatedString("Infoconnect");

    }


}
