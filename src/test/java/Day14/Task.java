package Day14;

public class Task {
    public static void main(String[] args) {
        stringTimes("Hi",3); //tzn ze 4 razy ma byc Hi czyli Name
        stringTimes("Dorota",5);
    }
    public static void stringTimes (String Name,int Num){
        String str=""; //empty string
        for(int i=0;i<Num; i++){
            str=str+Name; // concenation

        }
        System.out.println(str);

    }
}
