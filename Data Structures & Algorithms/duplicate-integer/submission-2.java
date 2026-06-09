class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            if(set.containsKey(nums[i])==true)
                return true;
            set.put(nums[i],1);
        }
        return false;
    }
}