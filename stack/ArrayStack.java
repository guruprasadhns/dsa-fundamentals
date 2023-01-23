public class ArrayStack {
    int store[];
    int default_capacity = 10;
    int capacity;
    int top = -1;

    public ArrayStack() {
        capacity = default_capacity;
        store = new int[default_capacity];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        store = new int[capacity];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= capacity;
    }

    public void push(int element) throws Exception {
        if(isFull()) 
            throw new Exception("Stack Overflow");
        store[++top] = element;
    }

    public int pop() throws Exception {
        if(isEmpty())
            throw new Exception("Stack Underflow");
        int removed_element = store[top];
        store[top--] = Integer.MIN_VALUE;
        return removed_element;
    }

    public void printStack() throws Exception {
        if(size() <= 0)
            throw new Exception("Stack is Empty");
        System.out.print("Stack Elements: ");
        for(int i = 0; i < size(); i++) {
            System.out.print(store[i] + " ");
        }        
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        try {
            stack.push(1);
            stack.push(2);
            stack.pop();
            stack.printStack();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}