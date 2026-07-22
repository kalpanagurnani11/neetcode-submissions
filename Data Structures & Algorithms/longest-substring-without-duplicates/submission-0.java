class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int r=0;
        int maxLength=0;
        HashSet set=new HashSet<>();
        for(r=0;r<=s.length()-1;r++)
        {

        
        char ch=s.charAt(r);
        {
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLength=Math.max(maxLength,r-left+1);
        }
        }
        return maxLength;
    }
}
