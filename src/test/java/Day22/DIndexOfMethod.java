package Day22;

public class DIndexOfMethod {
    public static void main(String[] args) {
        String zdanie="Hello Dorota, welcome to IT course with Senem";
        int x= zdanie.indexOf("Senem");
        System.out.println(x);
        System.out.println(zdanie.indexOf("IT"));

        String zdanie1="Github";
        System.out.println(zdanie1.indexOf("G"));
        System.out.println(zdanie1.indexOf("it"));
        System.out.println(zdanie1.indexOf("h"));
        System.out.println(zdanie1.indexOf("ub"));
        System.out.println(zdanie1.indexOf("D"));


    }
}
