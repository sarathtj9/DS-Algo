package net.javaguides.springboot.springsecurity.AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//time:O(n2) ,space:O(n)
public class maxSumIncreasingSubsequence {

    public static void main(String[] args) {
        maxSumIncreasingSubsequence maxSumIncreasingSubsequence= new maxSumIncreasingSubsequence();

        int[] array={10,70,20,30,50,11,30};

        System.out.println("the result is: "+maxSumIncreasingSubsequence.maxSumSeq(array));
    }

    public static List<List<Integer>> maxSumSeq(int[] array)
    {
        int[] sequences= new int[array.length];
        Arrays.fill(sequences,Integer.MIN_VALUE);
        int[] sums=array.clone();

        int maxSumIdx=0;

        for(int i=0;i<array.length;i++)
        {
            int currentNum= array[i];
            for(int j=0;j<i;j++)
            {
                int otherNum=array[j];
                if(otherNum < currentNum && sums[j]+currentNum >=sums[i])
                {
                    sums[i]=sums[j]+currentNum;
                    sequences[i]=j;
                }
            }
            if(sums[i]>=sums[maxSumIdx])
                maxSumIdx=i;
        }
        return buildSequence(array, sequences, maxSumIdx, sums[maxSumIdx]);
    }

    public static List<List<Integer>> buildSequence(int[] array,int[] sequences,
                                                    int currentIdx, int sums)
    {

        List<List<Integer>> sequence= new ArrayList<List<Integer>>();
        sequence.add(new ArrayList<Integer>());
        sequence.add(new ArrayList<Integer>());
        sequence.get(0).add(sums);

        while(currentIdx!=Integer.MIN_VALUE)
        {
            sequence.get(1).add(0,array[currentIdx]);
            currentIdx= sequences[currentIdx];
        }

        return sequence;
    }
}


