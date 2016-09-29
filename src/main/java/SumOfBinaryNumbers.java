/**
 * Created by rakeshg on 9/19/16.
 */
public class SumOfBinaryNumbers {

    private static void sumOfBinaryNumbers(String binary1, String binary2) {

        int a = Integer.parseInt(binary1, 2);
        int b = Integer.parseInt(binary2, 2);

        int c = a + b;
        System.out.println(Integer.toBinaryString(c));
    }

    public static void main (String[] args) {
        sumOfBinaryNumbers("0001", "111");
        sumOfBinaryNumbers("0000","00");
    }


}
