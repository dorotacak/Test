package Day31;

import java.util.Arrays;

public class BArayClass {
    public static void main(String[] args) {
        int[]nums={43,12,4,1,3,5};
        System.out.println(Arrays.toString(nums));//metoda toString,pozwala na napisanie array jako print sout
       // System.out.println(nums); //niedziała bez słowa arrays i toString
        int[]nums1={4,5,6,10,100};
        int[]nums2={4,5,6,10,100};
        System.out.println(Arrays.equals(nums1,nums2));



    }
}
