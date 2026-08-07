class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        int ans=right;
        for(int p:piles)
        {
            right=Math.max(right,p);
        }
     

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(isPossible(piles,h,mid))
            {
                ans=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
            
        }
        return ans;
    }

        private boolean isPossible(int[]piles,int h, int speed)
        {
            int hours=0;

            for(int p:piles)
            {
                hours+=(p+speed-1)/speed;
            }
            if(hours>h)
            {
                return false;
            }
            return true;

        }
        

}
