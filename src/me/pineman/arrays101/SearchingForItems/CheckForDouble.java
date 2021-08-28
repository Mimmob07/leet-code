package me.pineman.arrays101.SearchingForItems;

public class CheckForDouble {

    public static void main(String[] args) {
        int[] nums = {-2,0,10,-19,4,6,-8}; // Input array
        boolean solution = checkIfExist(nums);
        System.out.println(solution);
    }

    public static boolean checkIfExist(int[] arr) {

        boolean finalresult = false;
        boolean result = false;
        int res = 0;

        for (int num : arr) {
            for (int i : arr) {
                if (i == num * 2) {
                    System.out.println(num);
                    result = true;
                    break;
                }
            } // check if current num and its double exist in the array

            for (int j : arr) {
                if (num == j)
                    res++;
            }

            if (result && (num * 2 != num || res != 1)) {
//                if (num * 2 != num || res != 1) {
//                    finalresult = true;
//                }
                System.out.println(res);
                finalresult = true;
            }
            res = 0;
            result = false;
        }

        return finalresult;
    }

}
