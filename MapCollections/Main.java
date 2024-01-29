package MapCollections;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("banana",132);
        map.put("apple",895);
        map.put("mango",132);
        map.put("grapes",198);
        map.put("orange",83);

        System.out.println("getting a value from a key");
        System.out.println(map.get("banana"));

        System.out.println("checking if it contains key");
        boolean result = map.containsKey("banana");
        System.out.println(result ? "yes": "no");

    }
}
