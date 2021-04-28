package ADT;

public class LinkedList {
    Node tail;
    int size;

    static class Node {
        String data;
        Node next;
        Node(String _d) {
            data = _d;
            next = null;
        }
    }

    public int size() {return size;}

    public String peekEle() {return tail.next.data;}

    public void insertAtFront(String _d) {
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

    public void insertAtRear(String _d) {
        insertAtFront(_d);
        tail = tail.next;
        }

    public String delAtFront() {
        String data;
        if (tail == null)
            return "List is empty!!";
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

    public String delAtRear() {
        String data;
        if (tail == null)
            return "List is empty!!";
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

