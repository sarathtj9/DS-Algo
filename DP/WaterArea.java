package net.javaguides.springboot.springsecurity.AlgoExpert;

//time:O(n), space:O(n)
public class WaterArea {

    public static void main(String[] args) {
        WaterArea waterArea= new WaterArea();
        int[] heigts={0,8,0,0,5,0,0,10,0,0,1,1,0,3};

        System.out.println("ressult :"+waterArea.calWaterArea(heigts));
    }

    public static int calWaterArea(int[] heights) {
        // Write your code here.
        int[] maxes = new int[heights.length];
        int leftMax=0;

        for(int i=0;i<heights.length;i++)
        {
            int height = heights[i];
            maxes[i]= leftMax;
            leftMax= Math.max(leftMax, height);
        }

        int rightMax=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            int height = heights[i];
            int minHeight= Math.min(rightMax, maxes[i]);
            if(height<minHeight)
            {
                maxes[i] = minHeight-height;
            }else{
                maxes[i]=0;
            }
            rightMax = Math.max(rightMax, height);
        }
        int total=0;

        for(int i=0;i<heights.length;i++)
        {
            total+=maxes[i];
        }
        return total;
    }
}
