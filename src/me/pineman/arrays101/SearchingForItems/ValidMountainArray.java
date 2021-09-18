package me.pineman.arrays101.SearchingForItems;

import java.util.Arrays;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        boolean isvalid = validMountainArray(arr);
        System.out.println(isvalid);
    }

    public static boolean validMountainArray(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int len = arr.length;
        int i = 0;
        int index = 200;

        while (i < len) {
            if (arr[i] == max) {
                index = i;
                break;
            }
            i = i + 1;
        }

        if (index == 0 || index == len - 1) { return false; }

        for (int x = 1; x < index; x++) {
            if (arr[x] <= arr[x - 1]) { return false; }
        }

        for (int x = index + 1; x < arr.length; x++) {
            if (arr[x] >= arr[x - 1]) { return false; }
        }

        return true;
    }
}
