class Solution {
    public static void swap(int left,int right,int nums[]){
         int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
    }
    public void sortColors(int[] nums) {
       int left = 0;
       int right = nums.length-1;
       while(left<=right && nums[left]==0) left++; 
       while(left<=right && nums[right]==2) right--;
       int i=left;
       while(i<=right){
       if(nums[i]==0){
        swap(left,i,nums);
        left++;
          i++;  
       }else if(nums[i]==1){
  i++;
       }

      else{
        swap(i,right,nums);
        right--;
       }
       
       }
    }
}