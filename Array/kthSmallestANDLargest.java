package CollegePlacement.Array;

import java.util.Arrays;

public class kthSmallestANDLargest {
    public static void main(String[] args) {
        int[] a = { 7, 10, 4, 20, 15 };
        Arrays.sort(a);
        int k = 4;
        
        System.out.println(a[a.length-k]);
        System.out.println(a[k-1]);
    }
}
