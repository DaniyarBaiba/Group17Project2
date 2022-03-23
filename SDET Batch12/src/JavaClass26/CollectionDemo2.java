package JavaClass26;

import JavaClass20.A;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String>countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Monako");
        countries.add("KZ");
        countries.add("Ukraine");
        countries.add("Hungary");
        System.out.println(countries.get(3));
        //System.out.println(countries.get(-1)); out of bound
        System.out.println(countries);
        countries.add(3,"Russia"); //inserts the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.add("Russia");
        countries.remove("Russia");
        System.out.println(countries);
        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());


    }
}
