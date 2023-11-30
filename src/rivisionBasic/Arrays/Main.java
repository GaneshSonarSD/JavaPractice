package rivisionBasic.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9};
        int[] ans = swap(arr);


        System.out.println(Arrays.toString(ans));

    }
    static int[] swap(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
