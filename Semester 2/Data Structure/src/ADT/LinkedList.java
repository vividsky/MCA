package ADT;

public class LinkedList<E> {
    Node tail;
    int size;

    class Node {
        E data;
        Node next;
        Node(Object _d) {
            data = (E) _d;
            next = null;
        }
    }

    public int size() {return size;}

    public E peekEle() throws Exception {
        if (tail == null) throw new Exception("List is empty!!");
        return tail.next.data;
    }

    public void insertAtFront(Object _d) {
        Node tempNode = new Node(_d);
        if (tail == null) {
            tail = tempNode;
            tempNode.next = tail;
        } else {
            tempNode.next = tail.next;
            tail.next = tempNode;
        }
        size++;
    }

    public void insertAtRear(Object _d) {
        insertAtFront(_d);
        tail = tail.next;
        }

    public E delAtFront() throws Exception {
        E data;
        if (tail == null) throw new Exception("List is empty!!");
        else if (size == 1) {
            data = tail.data;
            tail = null;
        } else {
            data = tail.next.data;
            tail.next = tail.next.next;
        }
        size--;
        return data;
    }

    public E delAtRear() throws Exception {
        E data;
        if (tail == null) throw new Exception("List is empty!!");

        else if (size == 1) {
            data = tail.data;
            tail = null;
        } else {
            Node tempNode = tail.next;
            while (tempNode.next != tail) {
                tempNode = tempNode.next;
            }
            data = tail.data;
            tempNode.next = tail.next;
            tail = tempNode;
        }
        size--;
        return data;
    }
    public void display() {
        if (tail == null)
            System.out.println("List is empty!!");
        else {
            Node tempNode = tail.next;
            while (tempNode != tail) {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }
            System.out.println(tail.data);
        }
    }
}

