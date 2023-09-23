package Day21;

public class BCountHowMany {
    public static void main(String[] args) {
        String word="Medicine";
        int counter=0;
        char myChar='e';
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)==myChar){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
