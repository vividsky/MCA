import ADT.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        LinkedList arr = new LinkedList();
//        arr.insertAtFront("Ankit");
//        arr.insertAtRear("Nidhi");
//        arr.insertAtFront("Shraddha darlo");
//        arr.delAtFront();
//        arr.delAtRear();
//        arr.display();
        GrowableStack arrList = new GrowableStack();
        arrList.push("Nidhi");
        System.out.println(arrList.isEmpty());
        System.out.println(arrList.size());
        arrList.push("Ankit");
        arrList.push("Ankit");
        arrList.push("Ankit");
        arrList.push("Bhagesh");
        System.out.println(arrList.isEmpty());
        arrList.pop();
        arrList.pop();
        arrList.pop();
        arrList.pop();
        String a = arrList.pop();
        System.out.println(arrList.isEmpty());
        System.out.println(a);
        System.out.println(arrList.top());
        System.out.println(arrList.size());
//        arrList.top();
//        arrList

    }
}
