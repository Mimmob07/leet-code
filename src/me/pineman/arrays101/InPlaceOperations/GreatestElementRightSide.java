package me.pineman.arrays101.InPlaceOperations;

import java.util.Arrays;

public class GreatestElementRightSide {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
        arr[n - 1] = -1;
        for(int i = n - 2; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(max < temp)
                max = temp;
        }
        return arr;
    }

}
