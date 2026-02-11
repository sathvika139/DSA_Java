import java.util.Arrays;
class SmallestRange {
    public int smallestRangeII(int[] nums, int k)
     {
         int n=nums.length;
        if(n==1)  return 0;

         Arrays.sort(nums);
         int diff=nums[n-1]-nums[0];
         int small=nums[0]+k;
         int large=nums[n-1]-k;
        
       
         for(int i=1;i<n;i++){
             int sub=nums[i]-k;
             int add=nums[i-1]+k;
             
            // if(sub<0) continue;
             int minh=Math.min(small, sub);
             int maxh=Math.max(large,add);
             diff=Math.min(diff, maxh-minh);
        
         }
        return diff;
    }
}
   