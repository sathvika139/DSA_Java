import java.util.*;
class moveZeros 
{
    public static void moveZeroes(int[] a)
    {
        int i, j = 0;
        for (i = 0; i < a.length; i++) 
        {
            if (a[i] != 0) 
            {
                a[j] = a[i];
                j++;
            }
        }
        while (j < a.length) 
        {
            a[j] = 0;
            j++;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        moveZeroes(a);   
        for (int num : a) 
        {
            System.out.print(num + " ");
        }
        sc.close();
    }
}