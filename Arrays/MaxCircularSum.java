class MaxCircularSum {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int maxend=nums[0];
        int maxsofar=nums[0];
        int minend=nums[0];
        int minsofar=nums[0];

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            totalsum+=num;

            if(i>0){
                maxend=Math.max(num, maxend+num);
                maxsofar=Math.max(maxsofar, maxend);

                minend=Math.min(num, minend+num);
                minsofar=Math.min(minsofar, minend);
            }
        }
        if(maxsofar<0){
            return maxsofar;
        }
        return Math.max(maxsofar, totalsum-minsofar);
    }
}