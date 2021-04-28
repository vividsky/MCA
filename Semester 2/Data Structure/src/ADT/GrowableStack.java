//package ADT;
//new()
//push()
//pop()
//top()
//size()
//isEmpty()

public class GrowableStack<E> {
    static int size, top, bound;
    E[] stack;

    public GrowableStack() {
        size = 0;
        top = -1;
        bound = 4;
    }

    public boolean isEmpty() {return top == -1;}

    public int size() {return top + 1;}

    public Object top() {
        if (isEmpty()) {
            return "Stack is Empty!";
        }
        return stack[top];
    }

    public E pop() {
        if (isEmpty()) System.out.println("Stack is Empty!");
        return stack[top--];
    }

    public void push(Object ele) {
        if (top == size - 1) {
            E[] new_stack = (E[]) new Object[size + bound];
            for (int i = 0; i < size; i++) {
                new_stack[i] = stack[i];
            }
            stack = new_stack;
            size+=bound;
        }
        stack[top + 1] = (E) ele;
        top++;
    }
}
