import java.util.Map;

/**
 * Created by rakeshg on 7/13/16.
 */
public class CountOccurrenceOfCharInString extends FirstNonRepeatedCharInString {

    public void countOccurrence(String word, char ch) {

        String lowerWord = word.toLowerCase();
        Map<Character, Integer> map = super.splitStringToMap(lowerWord);

        System.out.println(map.get(ch));

    }

    public static void main(String[] args) {
        CountOccurrenceOfCharInString cn = new CountOccurrenceOfCharInString();
        cn.countOccurrence("RakeshRao", 'r');

    }
}
