package me.pineman.arrays101.introduction;

class EvenDigits {

    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        int answer = findNumbers(nums);
        System.out.println(answer);
    }

    public static int findNumbers(int[] nums) {
        int evenNums = 0;
        String numtostring;
        for (int num : nums) {
            numtostring = Integer.toString(num);
            if (numtostring.length() % 2 == 0) {
                evenNums++;
            }
        }
        return evenNums;
    }
}