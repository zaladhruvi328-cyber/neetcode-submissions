class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int p=1,s=1;
        result[0]=1;
        for(int i =1;i<nums.length;i++)
        {
            p*=nums[i-1];
            result[i] = p;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            s*=nums[i+1];
            result[i]*=s;
        }
        return result;

    }
}  
