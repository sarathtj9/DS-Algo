package net.javaguides.springboot.springsecurity.LeetCode;

//Time:O(n), space:O(1)
public class RotateDigits {

    public static void main(String[] args) {

        RotateDigits rotateDigits=new RotateDigits();
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotateDigits.rotate(arr,k);
        int[] result= new int[arr.length];
        for(int i=0;i<arr.length-1;i++)
        {
            result[i]=arr[i];
            System.out.print(result[i]+" ");
        }

    }

    public void rotate(int[] nums,int k)
    {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);//reverse all numbers
        reverse(nums,0,k-1);//reverse first k numbers
        reverse(nums,k,nums.length-1);//reverse last  k numbers
    }

    public void reverse(int[] nums,int left,int right)
    {
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
         }
    }
}
