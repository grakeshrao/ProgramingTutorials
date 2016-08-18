import org.apache.commons.lang3.StringUtils;

/**
 * Created by rakeshg on 8/4/16.
 */
public class DoubleToLong {

    /**
     * The logic for converting a double value to long
     */
    public static void main (String[] args) {
        String a = "-12.9";
        String valueStr = a.toString();
        if (StringUtils.isNotBlank(valueStr)) {
            Long longValue =  (long) Double.parseDouble(valueStr);
            System.out.print(longValue);
        } else {
            System.out.print("Null value");
        }

    }
}
