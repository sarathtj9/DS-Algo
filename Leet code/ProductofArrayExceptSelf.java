package net.javaguides.springboot.springsecurity.LeetCode;

//Time:O(n), space:O(n)
public class ProductofArrayExceptSelf {

    public static void main(String[] args) {

        ProductofArrayExceptSelf productofArrayExceptSelf= new ProductofArrayExceptSelf();
        int[] arr={1,2,3,4};
        int[] result= new int[arr.length];
        result =productofArrayExceptSelf.productExceptSelf(arr);
        for (int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }

    public int[] productExceptSelf(int[] nums) {

        int[] result= new int[nums.length];

        int[] L= new int[nums.length];
        int[] R=new int[nums.length];

        L[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            L[i]=L[i-1]*nums[i-1];
        }

        R[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            R[i]=R[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++)
        {
            result[i]=L[i]*R[i];
        }
        return result;
    }
}
