import org.apache.commons.lang3.StringUtils;

/**
 * Created by rakeshg on 8/4/16.
 */
public class DoubleToLong {

    /**
     * The logic for converting a double value to long
     */
    public static void main (String[] args) {
        convertToLong("-12.66");
        convertToLong("12.66");
        convertToLong("-12");
        convertToLong("12");
        convertToLong("12345.0000");

    }

    public static void convertToLong(String a) {
        String valueStr = a.toString();
        if (StringUtils.isNotBlank(valueStr)) {
            Long longValue =  (long) Double.parseDouble(valueStr);
            System.out.println(longValue);
        } else {
            System.out.println("Null value");
        }
    }
}
