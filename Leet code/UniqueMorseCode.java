package net.javaguides.springboot.springsecurity.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {

    public static void main(String[] args) {
        UniqueMorseCode uniqueMorseCode= new UniqueMorseCode();
        String[] words= new String[]{"gin", "zen", "gig", "msg"};
        System.out.println("result is :"+uniqueMorseCode.uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {

        String[] morse= new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> seen = new HashSet<>();

        for(String word: words)
        {
            StringBuilder sb= new StringBuilder();
            char[] ch=word.toCharArray();
            for(char c: ch)
            {
                sb.append(morse[c-'a']);
            }
            seen.add(sb.toString());
        }

        return seen.size();
    }
}
