package MapCollections;


import java.util.Map;
import java.util.TreeMap;

public class Index {
    public static void main(String[] args){
        Map<Integer,Integer> map = new TreeMap<>();

        map.put(1,4);
        map.put(3,4);
        map.put(6,4);
        map.put(9,4);
        map.put(3,4);
        map.put(2,4);

            System.out.println("getting entry at a specific key");
            System.out.println(map.get(1));

            System.out.println("finding if it contains key");
            boolean result = map.containsKey(2);
            System.out.println(result?"yes":"no");
            
        for(Map.Entry<Integer, Integer> it: map.entrySet()){
            System.out.println(it);
        }
    }
}
