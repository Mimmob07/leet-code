package me.pineman.arrays101.DeletingItems;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,4,4,0,4,4,4,0,2}; // Input array
        int val = 4; // Value to remove
//        int solution = removeElement(nums, val);
        int solution = removeElement(nums, val);
        System.out.println(solution);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return n;
    }

    public static int removeElement2(int[] nums, int val) {
        int k = 0;
        int i = 0;
        int j = 0;

        for (int num : nums) {
            if (num == val) {
                nums[i] = 0;
            }
            else {
                k++;
            }
            i++;
        }

        System.out.println(Arrays.toString(nums));

        for(int counter = nums.length - 1; counter >= 0; counter--) {
            if (nums[counter] == 0) {
                for (int x = counter + 1; x < nums.length; x++) {
                    nums[x - 1] = nums[x];
                }
                System.out.println(Arrays.toString(nums));
            }
            else {
                System.out.println("wasnt a zero");
            }
            j++;
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
}
