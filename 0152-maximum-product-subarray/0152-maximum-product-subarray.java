class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int result=nums[0];
        int minProduct=nums[0];
        int maxProduct=nums[0];
        for(int i=1;i<n;i++){
            int v1=nums[i];
            int v2=minProduct*nums[i];
            int v3=maxProduct*nums[i];
            maxProduct=Math.max(v1,Math.max(v2,v3));
            minProduct=Math.min(v1,Math.min(v2,v3));

            result=Math.max(result,Math.max(maxProduct,minProduct));

        }
        return result;
    }
}