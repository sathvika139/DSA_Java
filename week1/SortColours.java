import java.util.Arrays.*;
class SortColours {
    public void sortColors(int[] nums) {
        int m=0;
        int s=0,e=nums.length-1;
        while (m<=e){
            switch(nums[m]){
                case 0: int t=nums[m];
                         nums[m]=nums[s];
                         nums[s]=t;
                         s++;m++;
                         break;
                case 1: m++;
                        break;
                case 2: int t1=nums[m];
                        nums[m]=nums[e];
                        nums[e]=t1;
                        e--;
                        break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        Solution s=new Solution();
         int[] nums={2,0,2,1,1,0};
        
        s.sortColors(nums);
    }
}
