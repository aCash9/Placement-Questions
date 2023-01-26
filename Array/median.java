package CollegePlacement.Array;

public class median {
    public static void main(String[] args) {
        int arr1[] = { -5, 3, 6, 12, 15 } , arr2[] = { -12, -10, -6, -3, 4, 10 };
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr = new int[l1+l2];
        int i = 0,j=0,k=0;
        while( i < l1 && j < l2){
            if(arr1[i] < arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        if( i >= l1){
            while( j < l2){
                arr[k]=arr2[j];
                k++;j++;
            }
        }else {
            while( i < l1){
                arr[k]=arr1[i];
                k++;i++;
            }
        }
        int l3 = arr.length;
        if(l3 % 2 == 0){
            System.out.println(arr[l3/2]);
        }else{
            System.out.println((arr[l3/2]+arr[l3/2+1])/2);
        }
        for(int c : arr) System.out.println(c);
    }
}
