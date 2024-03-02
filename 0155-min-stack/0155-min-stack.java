class MinStack {

    Stack<Node>stack;
    int min;
    public MinStack() {
        stack=new Stack();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {

        if(stack.isEmpty())min=val; // if stack is empty
        else min=Math.min(stack.peek().min,val);

        stack.push(new Node(val,min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}
class Node{
    int min;
    int val;
    Node(int val,int min){
        this.val=val;
        this.min=min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 