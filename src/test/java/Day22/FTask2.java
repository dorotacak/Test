package Day22;

public class FTask2 {
    public static void main(String[] args) {
        checkedString("Dorota is in the house","is");
    }
    public static void checkedString(String str1,String str2){
        if(str1.contains(str2)){
            System.out.println(str1.indexOf(str2));
        }else{
            System.out.println("not found");
        }
    }

}
