import ADT.Queue;
import java.util.Scanner;
public class CallCenter {
    Queue<Integer> database= new Queue<>();

    public void addCall(Integer call) {
        database.enqueue(call);
        System.out.println(call + " has been added to serve later.");
    }
    public void callServed() {
        try {
            Integer servedCall = database.dequeue();
            System.out.println(servedCall + " has been served.");
        } catch (Exception e) {
            System.out.println("Sorry, all calls have been already served.");
        }
    }
    public void pendingCalls() {
        if (database.isEmpty()) {
            System.out.println("Database is Empty!");
        } else {
            System.out.println("Calls waiting to get served:");
            database.display();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CallCenter obj = new CallCenter();
        int choice;
        do {
            System.out.println("1. Add call to database" +
                    "\n2. Serve call from database" +
                    "\n3. Show calls to be served in database" +
                    "\n4. Exit" +
                    "\nEnter choice: ");
            choice = input.nextInt();
            switch(choice) {
                case 2: obj.callServed();
                break;
                case 3: obj.pendingCalls();
                break;
                case 1: {
                    System.out.println("Enter number: ");
                    Integer call = input.nextInt();
                    obj.addCall(call);
                }
            }
        } while (choice != 4);
    }

}
