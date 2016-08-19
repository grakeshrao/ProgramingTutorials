import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by rakeshg on 8/18/16.
 */
public class IteratingThroughHashMap {

    public static void main(String[] args) {
        iterationsForLoop();
    }

    public static void iterationsForLoop() {
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("adam", "developer");

        /**
         *  iteration using for each loop
         */
        for (String key : testMap.keySet()) {
            System.out.println("Iteration using for each");
            System.out.println("Key:" + key + " Value:" + testMap.get(key));
            System.out.println("*************");
        }

        /**
         * iteration using while loop
         */
        Iterator<String> itr = testMap.keySet().iterator();
        while (itr.hasNext()) {

            String key = itr.next();
            System.out.println("Iteration using while loop");
            System.out.println("Key:" + key + " Value:" + testMap.get(key));
            System.out.println("*************");

        }

        /**
         * iteration using EntrySet
         */
        Set<Map.Entry<String, String>> enSet = testMap.entrySet();
        for (Map.Entry entry : enSet) {
            System.out.println("Iteration using EntrySet");
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
            System.out.println("*************");
        }

        /**
         * iteration using EntrySet and Iterator
         */
        Set<Map.Entry<String, String>> entrySet = testMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> etr = iterator.next();
            System.out.println("Iteration using EntrySet");
            System.out.println("Key:" + etr.getKey() + " Value:" + etr.getValue());
            System.out.println("*************");
        }

    }
}
