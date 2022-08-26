package CoreJava.Collection;

import CoreJava.Serializable.Employee;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Tomato"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Apple", "Juice", "Orange", "Sauce"));
        System.out.println(findTrueFriends(list1, list2));
        findDuplicates("aaavssfeedsvbbdsgt555]]]]");
        create(1, "john", "doe", "1555", "asb 123", "123456789", "1110000");
        create(2, "jon", "d", "1666", "asb 254", "123456789", "1110000");
        create(3, "jo", "joe", "1777", "asb 879", "123456789", "1110000");
        create(4, "pop", "smo", "1888", "asb 354", "123456789", "1110000");
        create(5, "lil", "doe", "1999", "asb 7532", "123456789", "1110000");
        read(5);
        read(1);
        update(1, new Employee(1,"lily", "dolle", "2000", "asb 5555", "123456789", "1110000"));
        read(1);
        delete(5);
        read(5);
    }

    // (Set)Find true friends: Given two arraylists containing friend names, find the true friends that appear in both list.
    public static Set<String> findTrueFriends(ArrayList<String> list1, ArrayList<String> list2) {
        Set<String> set1 = new HashSet<>(list1);
        Set<String> ans = new HashSet<>();
        for (String s : list2) {
            if (set1.contains(s)) {
                ans.add(s);
            }
        }
        return ans;
    }

    // (Map)Given a string, output duplicate characters and their counts
    public static void findDuplicates(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c , map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
    }

    // Use a map to simulate database table, key should be the primary key (assume only one column), value is the record, your simulation should include CRUD operation methods

    static HashMap<Integer, Employee> map = new HashMap<>();
    public static void create(int ID, String firstName, String lastName, String DOB, String address, String phoneNumber, String ssn) {
        if (map.containsKey(ID)) {
            System.out.println("Record already exist for id: " + ID);
        } else {
            map.put(ID, new Employee(ID, firstName, lastName, DOB, address, phoneNumber, ssn));
            System.out.println("Employee " + ID + " created.");
        }
    }

    public static void read(int id) {
        if (!map.containsKey(id)) {
            System.out.println("No matching record for id: " + id);
        } else {
            System.out.println(map.get(id));
        }
    }

    public static void update(int id, Employee employee) {
        if (!map.containsKey(id)) {
            System.out.println("No matching record for id: " + id);
        } else {
            map.put(id, employee);
            System.out.println("Employee " + id + " updated.");
        }
    }

    public static void delete(int id) {
        if (!map.containsKey(id)) {
            System.out.println("No matching record for id: " + id);
        } else {
            map.remove(id);
            System.out.println("Employee " + id + " deleted.");
        }
    }
}
