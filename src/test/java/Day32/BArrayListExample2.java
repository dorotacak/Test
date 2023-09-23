package Day32;

import java.util.ArrayList;

public class BArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> Language=new ArrayList<String>();
        Language.add("English");
        Language.add("Polish");
        Language.add("Spanish");
        Language.add("German");
        Language.add("Turkish");
        System.out.println(Language.size());
        System.out.println(Language);
        Language.add("Russian");
        System.out.println(Language);
        Language.remove(0);//pierwsza metoda remove
        System.out.println(Language);
        Language.remove("Polish");//druga metoda remove
        System.out.println(Language);
    }
}
