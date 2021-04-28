package ADT;
//new()
//push()
//pop()
//top()
//size()
//isEmpty()

public class GrowableStack<obj> {
    static int size, top, bound;
    obj[] stack;

    public GrowableStack() {
        stack = new [0];
        size = 0;
        top = -1;
        bound = 4;
    }

    private static obj[] newArr(int size) {
        String[] new_stack = new String[size + bound];
        return new_stack;
    }

    public boolean isEmpty() {return top == -1;}

    public int size() {return top + 1;}

    public String top() {
        if (isEmpty()) {
            return "Stack is Empty!";
        }
        return stack[top];
    }

    public String pop() {
        if (isEmpty()) System.out.println("Stack is Empty!");
        String value = stack[top];
        top--;
        return value;
    }

    public void push(String ele) {
        if (top == size - 1) {
            String[] arr = newArr(size);
            for (int i = 0; i < size; i++) {
                arr[i] = stack[i];
            }
            arr[top+1] = ele;
            stack = arr;
            size+=bound;
        } else stack[top + 1] = ele;
        top++;
    }
}
