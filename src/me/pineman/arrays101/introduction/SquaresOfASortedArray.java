package me.pineman.arrays101.introduction;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int[] answer = sortedSquares(nums);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] sortedSquares(int[] nums) {

        int x = 0;

        for (int num : nums) {
            x++;
        }

        int newlist[] = new int[x];
        int i = 0;

        for (int num : nums) {
            newlist[i] = num * num;
            i++;
        }

        Arrays.sort(newlist);
        return newlist;
    }

}
