package ADT;

public class Stack {
    LinkedList stack = new LinkedList();

    public Boolean isEmpty() {return stack.size ==0;}

    public int length() {return stack.size;}

    public String peek() {
        if (isEmpty()) {return "Stack is Empty!!";}
        return stack.peekEle();
    }

    public void push(String _d) {
        stack.insertAtFront(_d);
    }

    public String pop() {
        if (isEmpty()) {return "Stack is Empty!!";}
        return stack.delAtFront();
    }
}
