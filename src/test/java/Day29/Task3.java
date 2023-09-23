package Day29;

public class Task3 {
    public static void main(String[] args) {
        String House=" ben senem ve dorotsa bugun array ogrendik ve biraz zor sorular cozduk. bursys not olmasi icin yaziyorum dorota " +
                "her seyi kolay ogrenmek olmaz dedi" +
                "mesela dil ogrenmek benim icin cok kolay aslinda" +
                "ama yeme yapmak benim icin zor dedi" ;
        String[] House1=House.split(" ");
        System.out.println(House1.length);
        System.out.println(House1[30]);
    }
}
