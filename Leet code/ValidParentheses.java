

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses= new ValidParentheses();
        String st="{()}";
        System.out.println("result "+validParentheses.isValid(st));
    }

    //O(n) time, O(n) space
    public boolean isValid(String str) {

        String openBrackets="{([";
        String closedBrackets="})]";

        Map<Character,Character> matchingChar = new HashMap<>();
        matchingChar.put(')','(');
        matchingChar.put('}','{');
        matchingChar.put(']','[');

        List<Character> stack= new ArrayList<>();

        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(openBrackets.indexOf(ch)!=-1)
                stack.add(ch);
            else if(closedBrackets.indexOf(ch)!=-1)
            {
                if(stack.isEmpty())
                    return false;

                if(stack.get(stack.size()-1)==matchingChar.get(ch))
                {
                    stack.remove(stack.size()-1);
                }
                else
                    return false;
            }

        }
        return stack.size()==0;
    }
}
