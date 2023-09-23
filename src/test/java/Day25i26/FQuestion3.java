package Day25i26;

public class FQuestion3 {
    public static void main(String[] args) {
        System.out.println(extraEnd("Dorota"));
        System.out.println(extraEnd("Komoda"));
        System.out.println(extraEnd("Katarzyna"));
        System.out.println(extraEnd("a"));

    }public static String extraEnd(String word){
        if(word.length()<2){
           return  "invalid word";
        }
        String dummy="";
        dummy=word.substring(word.length()-2);
        return dummy+dummy+dummy;
    }
}
