package Day32;

import java.sql.Array;
import java.util.ArrayList;

public class SCities {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<String>();
        cities.add("London");
        cities.add("Virginia");
        cities.add("DC");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add("Baku");
        System.out.println(cities);
        //Print each city by using for-each loop separated by space
        for(String city:cities){
            System.out.println(city + " ");

        }
        System.out.println(" ----------------------------------");
        //Print each city by using for-iterator loop separated by space, interator to
        for(int i=0; i< cities.size(); i ++){
            System.out.print(cities.get(i) + " ");
        }
    }
}
