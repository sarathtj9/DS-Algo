package net.javaguides.springboot.springsecurity.web;

public class BestTimeToBuyAndSell {

    public static void main(String args[])
    {
        BestTimeToBuyAndSell bestTimeToBuyAndSell= new BestTimeToBuyAndSell();
        int[] prices = {7,1,5,3,6,4};
        System.out.println("result :"+bestTimeToBuyAndSell.maxProfit(prices));

    }

    public int maxProfit(int[] prices) {

        int min =Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            maxProfit =Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
    }

}
