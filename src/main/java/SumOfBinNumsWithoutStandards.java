/**
 * Created by rakeshg on 9/20/16.
 */
public class SumOfBinNumsWithoutStandards {

    public static void binaryAddition(String s1, String s2) {
        if (s1 == null || s2 == null) {
            System.out.println("Either of the inputs is null");
        }
        int first = s1.length() - 1;
        int second = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                // TODO: why r e doing the subtraction
                sum += s1.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += s2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        System.out.println(String.valueOf(sb));
    }

    public static void main(String[] args) {
        binaryAddition("10","01");
    }
}
