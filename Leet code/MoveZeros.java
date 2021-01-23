package net.javaguides.springboot.springsecurity.LeetCode;

//time:O(n), space:O(1)s
public class MoveZeros {

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] arr = {0, 1, 0, 3, 12};
        int[] result= new int[arr.length];
        result= moveZeros.mvZeros(arr);
        for(int i=0;i<result.length;i++)
        System.out.print(result[i]+" ");
    }

    public int[] mvZeros(int[] nums)
    {
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[idx++]=nums[i];
            }
        }

        for(int i=idx;i<nums.length;i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
