import ADT.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
//        LinkedList arr = new LinkedList();
//        arr.insertAtFront("Ankit");
//        arr.insertAtRear("Nidhi");
//        arr.insertAtFront("Shraddha darlo");
//        arr.delAtFront();
//        arr.delAtRear();
//        arr.display();
//        GrowableStack<String> arrList = new GrowableStack<String>();
//        arrList.push("Nidhi");
//        System.out.println(arrList.isEmpty());
//        System.out.println(arrList.size());
//        arrList.push("Ankit");
//        arrList.push("Ankit");
//        arrList.push("Ankit");
//        arrList.push("Bhagesh");
//        System.out.println(arrList.isEmpty());
//        arrList.pop();
//        arrList.pop();
//        arrList.pop();
//        arrList.pop();
//        String a = arrList.pop();
//        System.out.println(arrList.isEmpty());
//        System.out.println(a);
//        System.out.println(arrList.top());
//        System.out.println(arrList.size());
//        arrList.top();
//        arrList
        Queue<String> queue = new Queue<>();
        queue.enqueue("hello");
        queue.enqueue("world");
        queue.enqueue("blahh");
        System.out.println(queue.front());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
