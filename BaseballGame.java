import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(String op : operations){
            if(op.equals("+")){
                int s1 = s.pop();
                int s2 = s1 + s.peek();

                s.push(s1);
                s.push(s2);
            }

            else if(op.equals("D")){
                int s1 = 2*s.peek();
                s.push(s1);
            }

            else if(op.equals("C")){
                s.pop();
            }

            else{
                s.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        while(!s.isEmpty()){
            total = total + s.pop();
        }

        return total;
    }
}