package net.javaguides.springboot.springsecurity.AlgoExpert;

//space:o(n),  time:o(n)
public class maxSubsetSumNoAdjacent {

    public static void main(String[] args) {

        maxSubsetSumNoAdjacent maxSubsetSumNoAdjacent=  new maxSubsetSumNoAdjacent();

        int[] array={75,105,120,75,90,135};

        System.out.println("the result is:  "+maxSubsetSumNoAdjacent.maxSumNoAdj(array));
    }

    public static int maxSumNoAdj(int[] array)
    {

        if(array.length==0)
            return 0;
        else if(array.length==1)
            return array[0];

        int[] maxSum = new int[array.length];
        maxSum[0]= array[0];
        maxSum[1]= array[1];

        for(int i=2;i<array.length;i++)
        {
            maxSum[i] = Math.max(maxSum[i-1], maxSum[i-2]+array[i]);
        }

        return maxSum[array.length-1];
    }
}
