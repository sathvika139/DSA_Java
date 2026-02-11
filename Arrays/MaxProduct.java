class MaxProduct {
    public int maxProduct(int[] nums) {
        int maxend=nums[0];
        int minend=nums[0];
        int maxp=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            
            int curr=nums[i];
            int pmax=maxend;
            int pmin=minend;
           maxend=Math.max(curr, Math.max(curr*pmax,curr*pmin));
            minend=Math.min(curr, Math.min(curr*pmax, curr*pmin));
            maxp=Math.max(maxp,maxend);
        }
        
        return maxp;
    }
}