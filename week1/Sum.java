class Sum
{
    public int getSum(int a, int b)
   {
    int sum;
    sum=a+b;
   return sum;  
   }

    public static void main(String[] args)
    {
        Solution s=new Solution();
        System.out.println(s.getSum(1,2));
        System.out.println(s.getSum(2,3));
        
    }

}