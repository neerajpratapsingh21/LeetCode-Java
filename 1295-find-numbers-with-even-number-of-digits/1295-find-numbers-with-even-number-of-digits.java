class Solution {
    int countDigit(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(countDigit(nums[i])%2==0) count++;
        }
        return count;
    }
}