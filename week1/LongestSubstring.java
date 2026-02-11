import java.util.*;

class LongestSubstring
{
    public int lengthOfLongestSubstring(String s) 
    {
        int left = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        
        for (int right = 0; right < s.length(); right++) 
        {
            char c = s.charAt(right);
    
            while (set.contains(c)) 
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
        }

    public static void main(String[] args)
    {
        Solution s=new Solution();
        System.out.println(s.lengthOfLongestSubstring("bbbbb"));
    }
}