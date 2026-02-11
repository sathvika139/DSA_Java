import java.util.*;

class MoveZeros
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

}