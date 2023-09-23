package Day25i26;//

public class Question9Homework {
    public static void main(String[] args) {
        System.out.println("|"+FunCharSeq("W").concat("W") + "|");
        //System.out.println(FunCharSeq(" W "));
    }
    public static String FunCharSeq(String str){
        str=str.trim(); //W
        str+="0";   //W0   lub druga metoda   str.concat("0")

        return str;


    }

}
