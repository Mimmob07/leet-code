package me.pineman.arrays101.Introduction;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
	    int answer = findMaxConsecutiveOnes(nums);
        System.out.println(answer);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int maxOnes = 0;
        for(int num : nums) {
            if(num == 1) {
                ones++;
            } else {
                ones=0;
            }
            if(ones>maxOnes){
                maxOnes=ones;
            }
        }
        return maxOnes;
    }
}