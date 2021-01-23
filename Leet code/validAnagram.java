package net.javaguides.springboot.springsecurity.LeetCode;

public class validAnagram {

    public static void main(String[] args) {
        validAnagram validAnagram= new validAnagram();
        String s="anagram";
        String t="nagaram";
        System.out.println("result:  "+validAnagram.valAnagram(s,t));
    }

    public boolean valAnagram(String s, String t)
    {
        if(s.length()!=t.length())
            return false;

        int[] letters = new int[26];
        for(int i=0;i<s.length();i++)
        {
            letters[s.charAt(i)-'a']++;
            letters[t.charAt(i)-'a']--;
        }

        for(int i:letters)
        {
            if(i!=0)
                return false;
        }
        return true;
    }

}
