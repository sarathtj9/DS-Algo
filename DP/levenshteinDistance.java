package net.javaguides.springboot.springsecurity.AlgoExpert;

public class levenshteinDistance {

    public static void main(String[] args) {
        levenshteinDistance levenshteinDistance= new levenshteinDistance();

        String s1="abc";
        String s2 ="yabd";
        System.out.println("the result is: "+levenshteinDistance.calDistance(s1,s2));
    }

    public static int calDistance(String s1,String s2)
    {
        int[][] dp= new int[s2.length()+1][s1.length()+1];

        for(int i=0;i<s2.length()+1;i++)
        {
            for (int j=0;j<s1.length()+1;j++)
            {
                dp[i][j]=j;
            }
            dp[i][0]=i;
        }

        for(int i=1;i<s2.length()+1;i++)
        {
            for(int j=1;j<s1.length()+1;j++)
            {
                if(s2.charAt(i-1)==s1.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else{
                    dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                }
            }
        }
        return dp[s2.length()][s1.length()];
    }
}
