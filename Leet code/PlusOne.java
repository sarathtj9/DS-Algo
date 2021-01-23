package net.javaguides.springboot.springsecurity.LeetCode;

public class PlusOne {

    public static void main(String[] args) {

        PlusOne plusOne = new PlusOne();
        int[] array={9,9,9};
        int[] result= plusOne.onePlus(array);
        System.out.println("result is "+result[2]);

        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public int[] onePlus(int[] digits)

    {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] result = new int[digits.length+1];
        result[0]=1;
        for(int i=1;i<result.length;i++)
        {
            result[i]=0;
        }
        return result;
    }
}
