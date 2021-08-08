package me.pineman.arrays101.InsertingItems;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] result = duplicateZeros(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] duplicateZeros(int[] arr) {
        int oglength = arr.length;
        boolean lastone = false;
        int i = 0;
        int remainder = 0;

        for (int num : arr) {
            if (num == 0) {
                if (lastone) {
                    lastone = false;
                }
                else {
                    for(int x=arr.length-1; x > i; x--){
                        arr[x] = arr[x-1];
                    }
                    arr[i] = 0;
                    lastone = true;
                }
            }
            else {
                lastone = false;
            }
            i++;
        }

        remainder = Math.abs(oglength - arr.length);

        for (int y = 0; y++ < remainder; y++) {
            Arrays.copyOf(arr, arr.length-1);
        }

        return arr;
    }
}
