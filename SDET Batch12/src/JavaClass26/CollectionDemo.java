package JavaClass26;

import JavaClass20.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Farah";
        //Not scalable if we have to store large amount of data
        //Arrays can be good option to tackle this problem
        String []  names={"Yazgul","Andrew"};
       // names[2]="Teyfur";
        String [] names2=new String[1000];
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents=new ArrayList<>();
       // ArrayList=>Name of the Class
        //<> diamond operator
        // String datatype
        syntaxStudents.add("Demetry");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Aizhan");
        System.out.println(syntaxStudents);
    }
}
