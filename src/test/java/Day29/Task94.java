package Day29;

import java.util.Arrays;

public class Task94 {
    public static void main(String[] args) {
        String info1="This info is used for creation password: xxxCD132Gxxx. Please do not share with anyone";
        String info2="This info is used for creation password: xxx00ABC0!xxx. Please do not share with anyone";
        String[] newInfo1=info1.split(" ");
        System.out.println(Arrays.toString(newInfo1));
        String password1=newInfo1[7].substring(3,9);
        System.out.println(password1);
        String[] newInfo2=info2.split(" ");
        System.out.println(Arrays.toString(newInfo1));
        String password2=newInfo2[7].substring(3,10);
        System.out.println(password2);
        System.out.println(password1+password2);


    }
}
