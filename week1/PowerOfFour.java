class PowerOfFour 
{
    public boolean isPowerOfFour(int n) 
    {
        if(n<=0)
         return false;
        if(n==1)
         return true;
        while(n%4==0)
         {
            n/=4;
         }
         return n==1;
    }
    public static void mani(String[] args)
    {
        Solution s=new Solution();
        System.out.println(s.isPowerOfFour(16));
    }
}