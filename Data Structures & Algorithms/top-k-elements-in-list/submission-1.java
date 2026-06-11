class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        List<Integer>[] bucket = new ArrayList[nums.length+1];

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer key : map.keySet())
        {
            int freq = map.get(key);
            if(bucket[freq]==null)
            {
                bucket[freq] = new ArrayList();
            }
            bucket[freq].add(key);
        }

        for(int i = bucket.length-1;i>=0 && result.size()<k;i--)
        {
            if(bucket[i]!=null)
                result.addAll(bucket[i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
