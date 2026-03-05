class MyQueue {

    int[] input = new int[100];
    int[] output = new int[100];

    int front = -1;   
    int rear = -1;    

    public void MyQueue() {
        if (rear == -1) {               
            while (front != -1) {
                output[++rear] = input[front--];
            }
        }
    }

    public void push(int x) {
        input[++front] = x;
    }

    public int pop() {
        MyQueue();
        return output[rear--];
    }

    public int peek() {
        MyQueue();
        return output[rear];
    }

    public boolean empty() {
        return front == -1 && rear == -1;
    }
}