class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        
        int longest =1;
        Set<Integer> set = new HashSet<>();
        for(int n : nums)
        {
            set.add(n);
        }
        for(Integer num: set)
        {
            if(!set.contains(num-1))
            {
                int current =1;
                int tmp = num;
                while(set.contains(tmp+1))
                {
                    current++;
                    tmp++;
                }
                longest = Math.max(longest,current);
            }
        }
        return longest;
    }
}
