
class TwoSum
{

    public static void main(String args[])
    {
        TwoSum twoSum = new TwoSum();
        int[] result= new int[2];
        int[] nums = {2,7,11,15};
        int target=9;
        result = twoSum.sum(nums, target);
        System.out.println("result of two sum: "+result);
    }

    public int[] sum(int[] nums, int target) {


        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();


        for(int i=0;i<nums.length;i++)
        {
            int val = target-nums[i];

            if(hmap.containsKey(val))
                return new int[]{hmap.get(val),i};
            hmap.put(nums[i],i);//2, 0
        }

        return new int[]{-1,-1};
    }
}