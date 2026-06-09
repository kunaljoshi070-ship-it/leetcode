import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                continue;
            }
            if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                char t = stack.peek();
                
                if(ch == ')' && t == '('){
                    stack.pop();
                    continue;
                }

                if(ch == '}' && t == '{'){
                    stack.pop();
                    continue;
                }

                if(ch == ']' && t == '['){
                    stack.pop();
                    continue;
                }
                
                return false;
            }
        }

        return stack.isEmpty();
    }
}