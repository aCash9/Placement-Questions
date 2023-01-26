package CollegePlacement.Array;

public class sort012 {
    public static void main(String[] args) {
        int[] a = { 2, 1, 0, 2, 0, 1, 1, 2 };

        int zero = 0, one = 0;
        for (int i : a)
            if (i == 0)
                zero++;
            else if (i == 1)
                one++;

        for (int i = 0; i < a.length; i++) {
            if(zero > 0){
                a[i]=0;
                zero--;
            }else if(one > 0){
                a[i]=1;
                one--;
            }
            else {
                a[i]=2;
            }
        }
        for(int i : a) System.out.println(i);
    }
}
/*
 * 0 2 1 2 0
 * 0 0 1 2 2
 * 
 * 
 * 0 0 2 1 2 1 0
 * 0 0 0 1 2 1 2
 * 
 */