package ADT;

public class Stack<E> {
    LinkedList stack = new LinkedList();

    public Boolean isEmpty() {return stack.size ==0;}

    public int length() {return stack.size;}

    public E peek() throws Exception {
        if (isEmpty()) throw new Exception("List is Empty!!");
        return (E) stack.peekEle();
    }

    public void push(Object _d) {
        stack.insertAtFront(_d);
    }

    public E pop() throws Exception {
        if (isEmpty()) throw new Exception("List is Empty!!");
        return (E) stack.delAtFront();
    }
}
