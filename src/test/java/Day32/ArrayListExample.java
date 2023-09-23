package Day32;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>Name=new ArrayList<String>();
        ArrayList<Integer>Number=new ArrayList<Integer>();

        //Asigning values to arrayList

        Name.add("Dorota");
        Name.add("Hakan");
        Name.add("Musab");
        Name.add("Sad");
        Name.add("Ali");
        System.out.println(Name);
        Number.add(90);
        Number.add(95);
        Number.add(98);
        Number.add(89);
        Number.add(87);
        System.out.println(Number);
        System.out.println(Name.get(2));
        System.out.println(Number.get(4));
        System.out.println(Name.size());
        System.out.println(Number.size());



    }
}
