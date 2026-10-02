class Solution {
    public int maximumSum(int[] arr) {
        int bestNoDel=arr[0];
        int bestOneDel=-1;
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            bestOneDel=Math.max(bestOneDel+arr[i],bestNoDel);
            bestNoDel=Math.max(bestNoDel+arr[i],arr[i]);
          
            ans = Math.max(ans,Math.max(bestNoDel,bestOneDel));

        }
        return ans;
    }
}