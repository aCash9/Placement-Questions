package CollegePlacement.Array;

public class moveNegative {
    public static void swap(int[] a,int left , int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public static void main(String[] args) {
        int[] a ={ -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int left = 0 , right = a.length-1;
        while(left <= right){
            if(a[left] < 0){
                left++;
            }else {
                swap(a, left, right--);
            }
        }
        for(int i: a) System.out.println(i);
    }
}
