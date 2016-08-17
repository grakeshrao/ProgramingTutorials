import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakeshg on 8/17/16.
 */
public class FindDuplicateFrom1toN {

    // This method finds the duplicate number from the list
    private static void findDuplicateNumber(List<Integer> list) {
        int highestNumber = list.size() - 1;
        int total = getSum(list);
        int duplicate = total - (highestNumber * (highestNumber + 1) / 2);

        System.out.println(duplicate);
    }

    // This method gives the sum of the integers in a List
    private static int getSum(List<Integer> list) {
        int sum = 0;
        if (list != null && !list.isEmpty()) {
            for (int a : list) {
                sum += a;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < 30; i++) {
            numbers.add(i);
        }
        numbers.add(11);

        findDuplicateNumber(numbers);
    }
}
