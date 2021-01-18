package net.javaguides.springboot.springsecurity.AlgoExpert;

public class numberOfWaysToMakeChange {
 //Space :o(n) //time:o(nd)
    public static void main(String[] args) {
        numberOfWaysToMakeChange numberOfWaysToMakeChange= new numberOfWaysToMakeChange();
        int target=10;
        int[] denoms={1,5,10,25};
        System.out.println("the result is: "+numberOfWaysToMakeChange.ways(target,denoms));
    }

    public static int ways(int n,int[] denoms)
    {
        int[] dp= new int[n+1];
        dp[0]=1;//There is one way to make zero dollars which is not to use any coins
        for(int denom:denoms)
        {
            for(int amount=1;amount<n+1;amount++)
            {
                if(denom<=amount)
                    dp[amount]+=dp[amount-denom];
            }

        }
        return dp[n];
    }
}
