import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * Created by rakeshg on 7/13/16.
 */
public class CountOccurrenceOfCharInString extends FirstNonRepeatedCharInString {

    public static void main(String[] args) {
        CountOccurrenceOfCharInString cn = new CountOccurrenceOfCharInString();
        cn.countOccurrence("RakeshRao", 'r');
    }

    /**
     * Logic for counting occurrence of the characters in String. We are reusing the splitStringToMap from FirstNonRepeatedCharInString class.
     * @param word
     * @param ch
     */
    public void countOccurrence(String word, char ch) {

        String lowerWord = word.toLowerCase();
        Map<Character, Integer> map = super.splitStringToMap(lowerWord);

        System.out.println(map.get(ch));

    }
}
