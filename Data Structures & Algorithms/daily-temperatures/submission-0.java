class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer>stk=new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!stk.empty()&& temperatures[stk.peek()]<=temperatures[i])
            {
                stk.pop();
            }

            if(!stk.empty())
 {
    ans[i]=stk.peek()-i;
 }     
   
   stk.push(i);
        }
   return ans;
        
        
    }
}
