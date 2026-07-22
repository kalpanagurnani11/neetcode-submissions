class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int left=0;
        int maxfreq=0;
        int maxlength=0;

        for(int r=0;r<s.length();r++)
        {
            count[s.charAt(r)-'A']++;

            maxfreq=Math.max(maxfreq,count[s.charAt(r)-'A']);


            while((r-left+1)-maxfreq>k)
            {
                count[s.charAt(left)-'A']--;
                left++;
            }

            maxlength=Math.max(maxlength,r-left+1);
        }
        return maxlength;

        
    }
}
