public class LinkedListStack {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    int length;
    Node top;

    LinkedListStack() {
        length = 0;
        top = null;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        length++;   
    }

    public int pop() {
        Node removedNode = top;
        top = top.next;
        removedNode.next = null;
        length--;
        return removedNode.data;   
    }

    public void printStack() {
       Node current = top;
       while(current != null) {
          System.out.print(current.data + " ");
          current = current.next;
       }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.printStack();
    }
}