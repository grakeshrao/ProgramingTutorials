import org.apache.commons.lang3.StringUtils;

/**
 * Created by rakeshg on 7/6/16.
 */
public class StringPalindrome {

    public void stringPalindrome(String str) {

        if (StringUtils.isNotBlank(str)) {

            StringBuilder revStr = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                revStr = revStr.append(str.charAt(i));
            }

            if (StringUtils.equalsIgnoreCase(str, revStr)) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is not a Palindrome");
            }

        }
    }

}
