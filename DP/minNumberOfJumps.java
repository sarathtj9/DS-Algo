package net.javaguides.springboot.springsecurity.AlgoExpert;

import java.util.Arrays;

public class minNumberOfJumps {

    public static void main(String[] args) {
        minNumberOfJumps minNumberOfJumps= new minNumberOfJumps();

        int[] array={3,4,2,1,2,3,7,1,1,3};
        System.out.println("the result is: "+minNumberOfJumps.minJumps(array));
    }
   //time:O(n), space:O(1)
    public static int minJumps(int[] array)
    {
        if(array.length==1)
            return 0;

        int jumps=0;
        int maxReach= array[0];
        int steps=array[0];

        for(int i=1;i<array.length-1;i++)
        {
            maxReach = Math.max(maxReach,array[i]+i);
            steps--;

            if(steps==0)
            {
                jumps++;
                steps =maxReach-i;
            }
        }
        return jumps+1;

        //or
//  time:O(n2) , space:O(n)
//        int[] jumps= new int[array.length];
//        Arrays.fill(jumps,Integer.MAX_VALUE);
//        jumps[0]=0;
//        for(int i=1;i<array.length;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                if(array[j]+j>=i)
//                {
//                    jumps[i]=Math.min(jumps[i],jumps[j]+1);
//                }
//            }
//        }
//        return jumps[jumps.length-1];
    }
}
