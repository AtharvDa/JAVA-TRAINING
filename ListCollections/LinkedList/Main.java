package ListCollections.LinkedList;

import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        List<String> cities = new LinkedList<>();
        
        cities.add("hyderabad");
        cities.add("ranchi");
        cities.add("gurugram");
        cities.add("agra");
        cities.add("banglore");
        
        System.out.println("getting the size of linkedlist");
        System.out.println(cities.size());

        System.out.println("getting value at a specific place");
        System.out.println(cities.get(2));

        System.out.println("setting value at a specific place");
        System.out.println(cities.set(2,"chennai"));
        System.out.println(cities.get(2));

        System.out.println("removing the element from a particular place");
        System.out.println(cities.remove(2));
        System.out.println();
        for(String it: cities){
            System.out.println(it);
        }

    }
}
