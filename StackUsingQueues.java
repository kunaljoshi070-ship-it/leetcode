import java.util.*;

class MyStack {
    Queue<Integer> in = new ArrayDeque<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        int size = in.size();
        in.add(x);
        for(int i=0; i<size-1; i++){
            in.add(in.remove());
        }
    }
    
    public int pop() {
        return in.remove();
    }
    
    public int top() {
        return in.peek();
    }
    
    public boolean empty() {
        return in.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */