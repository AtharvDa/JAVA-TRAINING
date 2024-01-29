package ListCollections.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> cities = new ArrayList<>();
        cities.add("hyderabad");
        cities.add("kolkata");
        cities.add("gurugram");
        cities.add("banglore");
        cities.add("lucknow");

        System.out.println("The size of the arraylist is");
        System.out.println(cities.size());

        System.out.println("finding element at a specific index");
        System.out.println(cities.get(2));

        System.out.println("changing value at a specific index");
        System.out.println(cities.set(2,"bhopal"));
        System.out.println(cities.get(2));

        System.out.println("removing element from a specific index");
        cities.remove(2);

        for(String it: cities){
            System.out.println(it);
        }
    }
}
