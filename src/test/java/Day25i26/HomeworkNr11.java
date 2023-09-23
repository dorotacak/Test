package Day25i26;

public class HomeworkNr11 {
    public static void main(String[] args) {
        String space=" ";
        String composite=space+"hello"+space+space;
        composite.concat("world");//nie ma znaczenia
        System.out.println(composite);
        String trimmed=composite.trim();

        System.out.println(trimmed.length());

    }
}
