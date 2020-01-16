package lesson4;

public class MyLinkedStack<T>  {
    private MyLinkedList<T> stack = new MyLinkedList<>();

    public int getSize(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void push(T value) {
        stack.insertLast(value);
    }

    public T pop() {
        return stack.removeLast();
    }

    public T peek(){
        return stack.getLast();
    }

}
