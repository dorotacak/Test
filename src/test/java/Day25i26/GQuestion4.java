package Day25i26;

public class GQuestion4 {
    public static void main(String[] args) {
        System.out.println(firstTwo("Katarzyna"));
        System.out.println(firstTwo(""));
        System.out.println(firstTwo("x"));
    }public static String firstTwo(String Name){
        if(Name.length()<2){
            return Name;
        } else if (Name.isEmpty()) {
           return "";
        }else{
            return Name.substring(0,2);

        }
    }
}
