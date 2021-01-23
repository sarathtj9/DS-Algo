package net.javaguides.springboot.springsecurity.LeetCode;

//O(N), space:O(1)
public class StringReverse {

    public static void main(String[] args) {

        StringReverse stringReverse= new StringReverse();
        String str="hello world";

        char[] ch= str.toCharArray();
        int left=0;
        int right=ch.length-1;

        while(left<right)
        {
            char temp= ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }

        for (int i =0; i<ch.length; i++)
            System.out.print(ch[i]);
    }
}
