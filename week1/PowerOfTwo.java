class PowerOfTwo
{
    public boolean isPowerOfTwo(int n)
    {  boolean value;
         if(n<=0)
           return false;
         if(n==1)
           return true;
       
       while(n%2==0) {
            n/=2;
        }
        return n==1;
    }

   public static void main(String[] args)
   {
    Solution s=new Solution();
    System.out.println(s.isPowerOfTwo(1));
   }
}