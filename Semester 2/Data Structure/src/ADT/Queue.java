package ADT;

public class Queue<E> {

    LinkedList queue = new LinkedList();

    public Boolean isEmpty() {return queue.size ==0;}

    public int size() {return queue.size;}

    public E front() throws Exception{
        if (isEmpty()) throw new Exception("Queue is Empty!");
        return (E) queue.peekEle();
    }

    public void enqueue(Object _d) {
        queue.insertAtRear(_d);
    }
    public E dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is Empty!");
        return (E) queue.delAtFront();
    }
    public void display() {
        queue.display();
    }
}
