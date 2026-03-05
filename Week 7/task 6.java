class MyStack {
    Deque<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.addLast(x);
    }
    
    public int pop() {
        return q.removeLast();
    }
    
    public int top() {
        return q.getLast();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

