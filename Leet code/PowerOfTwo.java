package net.javaguides.springboot.springsecurity.LeetCode;

public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo= new PowerOfTwo();
        int n=16;
        System.out.println("result:  "+powerOfTwo.isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {

        int i=1;

        while(i<n)
        {
            i=i*2;
        }
     return i==n;
    }
}
