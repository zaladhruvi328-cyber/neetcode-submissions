class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int p=1,s=1;
        prefix[0]=1;
        suffix[nums.length-1]=1;
        for(int i =1;i<nums.length;i++)
        {
            p*=nums[i-1];
            prefix[i] = p;
        }
        System.out.println("======================");
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(prefix[i]+",");
        }
        System.out.println("======================");
        for(int i=nums.length-2;i>=0;i--)
        {
            s*=nums[i+1];
            suffix[i]=s;
        }
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(suffix[i]+",");
        }
        System.out.println("======================");
        for(int i=0;i<nums.length;i++)
        {
            result[i]=prefix[i]*suffix[i];
        }
        return result;

    }
}  
