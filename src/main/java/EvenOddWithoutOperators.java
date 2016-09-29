/**
 * Created by rakeshg on 9/14/16.
 */
public class EvenOddWithoutOperators {

    private static void evenOdd(int num) {
        if (num == 0) {
            System.out.println("The number is neither even nor odd");
            return;

        }
        while (num >= 2) {
          num = num - 2;
        }

        if (num == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }

    public static void main (String[] args) {
        evenOdd(0);
    }

}
