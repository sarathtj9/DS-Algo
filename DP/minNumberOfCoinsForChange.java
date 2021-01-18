package net.javaguides.springboot.springsecurity.AlgoExpert;

import java.util.Arrays;
//space: O(n) //time:O(nd)
public class minNumberOfCoinsForChange {
    public static void main(String[] args) {

        minNumberOfCoinsForChange minNumberOfCoinsForChange= new minNumberOfCoinsForChange();

        int[] denoms={1,2,4};
        int target= 6;
        System.out.println("the result is:  "+minNumberOfCoinsForChange.minCoins(target,denoms));
    }

    public static int minCoins(int n,int[] denoms)
    {

        int[] dp= new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        int toCompare=0;
        for(int denom: denoms)
        {
            for(int amount=0;amount<n+1;amount++)
            {
                if(denom<=amount)
                {
                    if(dp[amount-denom] == Integer.MAX_VALUE) {
                        toCompare =dp[amount-denom];
                    }else{
                        toCompare = dp[amount-denom]+1;
                    }
                    dp[amount]=Math.min(dp[amount],toCompare);
                }
            }
        }
        return dp[n]!= Integer.MAX_VALUE? dp[n]:-1;
    }
}
