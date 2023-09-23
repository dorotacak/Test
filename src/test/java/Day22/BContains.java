package Day22;

public class BContains {
    public static void main(String[] args) {
        String Poland=" There are many doctors";
        boolean Warsaw=Poland.contains("car");
        System.out.println(Warsaw);//albo drugi sposob
        System.out.println(Poland.contains("There"));

        String list="apples,bananas, milk, bread,cheese";
        if(list.contains("milk")){
            System.out.println("Prepare a cake");

        }else{
            System.out.println("Prepare dinner");
        }
    }
}
