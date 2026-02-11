import java.util.*;
class TwoSum
{
    public int[] twoSum(int[] nums, int target) 
    {
             int v,j;
            for (int i=0;i<=nums.length-1;i++)
            {
                for (j=0;j<=nums.length-1;j++)
                {
                  v=nums[i]+nums[j];
                   if(v==target && i!=j)
                   {
                      System.out.println(nums[i]+","+nums[j]); 
                      return new int[]{i, j}; 
                     }
                }
            }
            return new int[]{-1, -1};
      }
  public static void main(String[] args)
  {
    Solution s=new Solution();
    int[] nums={3,2,4};
    int target=6;
    int[] result = s.twoSum(nums, target); 
        System.out.println(Arrays.toString(result));
  }
}