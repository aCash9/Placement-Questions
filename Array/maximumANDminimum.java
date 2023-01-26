package CollegePlacement.Array;

public class maximumANDminimum {
    public static void main(String[] args) {
        int[] a ={1,32,213,56};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : a){
            if(i > max)
                max = i;
            else if(i < min)
                min = i;
        }
        System.out.println(max);
        System.out.println(min);
    }    
}
