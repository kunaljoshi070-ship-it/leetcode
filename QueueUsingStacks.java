import java.util.*;

class MyQueue {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
       inStack.push(x);          
    }
    
    public int pop() {
        int inSize = inStack.size();

        if(outStack.isEmpty()){
            while(inSize != 0){
                outStack.push(inStack.pop());
                inSize--;
            }
        }

        return outStack.pop();
    }
    
    public int peek() {
        int inSize = inStack.size();

        if(outStack.isEmpty()){
            while(inSize != 0){
                outStack.push(inStack.pop());
                inSize--;
            }
        }

        return outStack.peek();
    }
    
    public boolean empty() {
        if(inStack.isEmpty() && outStack.isEmpty()){
            return true;
        }

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */