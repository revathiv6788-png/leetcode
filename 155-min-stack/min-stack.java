class MinStack {
    Stack<Integer> source=new Stack<>();
    Stack<Integer> minstack=new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        source.push(val);
        if(minstack.isEmpty()||val<=minstack.peek())
        {
            minstack.push(val);
        } 
    }
    
    public void pop() {
        if(source.isEmpty())
        {
            return;
        }
         if(!source.peek().equals(minstack.peek()))//!=use panna koodathu
         {
            source.pop();
         }
         else
         {
            source.pop();
            minstack.pop();
         }
    }
    
    public int top() {
        return source.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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