package me.pineman.arrays101.DeletingItems;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int solution = removeDuplicates(nums);
        System.out.println(solution);
    }

    public static int removeDuplicates(int[] nums) {
        int x = 0;
        int n = nums.length;

        while (x + 1 < n) {
            if (nums[x] == nums[x + 1]) {
                System.arraycopy(nums, x + 1, nums, x, n - x - 1);
//                for (int i = x + 1; i < nums.length; i++) {
//                    nums[i - 1] = nums[i];
//                }
                System.out.println(Arrays.toString(nums));
                System.out.println("if statment was true!");
                n--;
            }
            else {
                System.out.println("adding to x");
                x++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return n;
    }

}
