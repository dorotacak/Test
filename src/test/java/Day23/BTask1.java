package Day23;

public class BTask1 {
    public static void main(String[] args) {
        String Names="&^@#J$a_v/a@#$";
        String NewName= Names.replace("&^@#","");
        System.out.println(NewName);
        NewName=NewName.replace("$", "").replace("_","")
                .replace("/", "").replace("@#","");
        System.out.println(NewName);
    }
}
