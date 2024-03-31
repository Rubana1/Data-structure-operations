import java.util.*;

public class Operations {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("BMW");
        linkedlist.add("Rolls Royce");
        linkedlist.add("Audi");

        String search = "BMW";
        if (linkedlist.contains(search)) {
            System.out.println(search + " data is in linkedlist");
        } else {
            System.out.println(search + " data not in linkedlist");
        }

        linkedlist.remove("Audi");
        System.out.println("Audi is removed from linkedlist: " + linkedlist);


        // ArrayList

        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(1000);
        arraylist.add(2000);
        arraylist.add(3000);


        int searchint = 2000;
        if (arraylist.contains(searchint)) {
            System.out.println(searchint + " data is in arraylist");
        } else {
            System.out.println(searchint + " data not in arraylist");
        }

        arraylist.remove(Integer.valueOf(2000)); // Remove by value
        System.out.println("Data 2000 is removed from arraylist: " + arraylist);

        // HashMap

        HashMap<String, Integer> hashmap = new HashMap<>();

        hashmap.put("one", 1);
        hashmap.put("two", 2);
        hashmap.put("three", 3);

        String searchkey = "two";
        if (hashmap.containsKey(searchkey)) {
            System.out.println(searchkey + " data is in hashmap");
        } else {
            System.out.println(searchkey + " data is not in hashmap");
        }

        hashmap.remove("two");
        System.out.println("Key 'two' is removed from hashmap: " + hashmap);


        // HashSet

        HashSet<Character> hashset = new HashSet<>();

        hashset.add('a');
        hashset.add('b');
        hashset.add('c');

        char searchchar = 'b';
        if (hashset.contains(searchchar)) {
            System.out.println(searchchar + " data is in hashset");
        } else {
            System.out.println(searchchar + " data is not in hashset");
        }

        hashset.remove('b');
        System.out.println("Data 'b' is removed from hashset: " + hashset);
    }
}
