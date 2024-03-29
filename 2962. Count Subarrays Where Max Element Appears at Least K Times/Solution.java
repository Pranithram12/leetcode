class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        //find max element
        int maxelement=0;
        for(int i=0;i<n;i++){
            maxelement=Math.max(maxelement,nums[i]);
        }

        
         int start=0;
         int end=0;
         long count=0;
         int maxelementfreqcount=0;

         while(end<n){
             //expansion phase
             if(nums[end] == maxelement){
                maxelementfreqcount++;
             }

             //shrinking phase
             while(maxelementfreqcount == k){
                count=count+(n-end);
                if(nums[start] == maxelement){
                    maxelementfreqcount--;
                }
                start++;
             }
             end++;
         }
         return count;
    }
}