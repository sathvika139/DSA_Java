class PowerOfThree 
{
    public boolean isPowerOfThree(int n)
    {
        if(n<=0)
          return false;
        if(n==1)
          return true;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }

    public static void main(String[] args)
    {
        Solution s=new Solution();
        System.out.println(s.isPowerOfThree(27));
    }
}