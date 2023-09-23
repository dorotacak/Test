package Day25i26;

public class HomeworkNr13 {
    public static void main(String[] args) {
        String str = "JavaScript";
        System.out.println(getMsg(str));


    }public static String getMsg(String x){
        String Msg="Input value must be";
        Msg=Msg.concat("smaller than x");
        Msg.replace("x", x);//nie ma znaczenia
        String rest="and larger than 0";//nie ma znaczenia
        Msg.concat(rest);

        return Msg;


    }
}
