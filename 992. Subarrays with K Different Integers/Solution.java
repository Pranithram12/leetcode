class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostk(nums,k) - atmostk(nums,k-1);
    }
    public int atmostk(int[] nums,int k){
        int start=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);

            while(map.size() > k){
                if(map.get(nums[start]) > 1){
                    map.put(nums[start],map.get(nums[start])-1);
                }
                else{
                    map.remove(nums[start]);
                }
                start++;
            }
            count += (end-start + 1);
        }
        return count;
    }
}