package Day25i26;

public class HomeworkNr20 {
    public static void main(String[] args) {
        String userName="Mike";
        String password="12/3";
        String blank="><#${[]}|~`abgvchjkyiol,gddfhkkll;";

        if(userName==" " && password==" "){
            System.out.println("User name and password are blank");
        }else if(userName==" " && password!=" "){
            System.out.println("User name cannot be empty");
        }else if((userName!=" " && password==" ")){
            System.out.println("Password can not be empty");

        }else{
            for(int i=0;i<blank.length();i++){
                char find=blank.charAt(i);
                if(userName.indexOf(find)>0||password.indexOf(find)!=-1){
                    System.out.println("User name or password is not valid. Please verify");
                    break;

                }
            }
        }
    }
}

