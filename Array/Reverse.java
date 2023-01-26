package CollegePlacement.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int st = 0;
        int last = arr.length - 1;
        while (st < last) {
            int temp = arr[st];
            arr[st] = arr[last];
            arr[last] = temp;
            st++;
            last--;
        }
        for (int i : arr)
            System.out.println(i);
    }
}
