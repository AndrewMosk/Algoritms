package lesson_3;

import java.util.EmptyStackException;

public class MyDeque<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;
    private int beginInsertRight = DEFAULT_CAPACITY-1;

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = value;
        size++;
        end = nextIndex(end);
    }

    public void insertRight(T value){
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[beginInsertRight] = value;
        size++;
        beginInsertRight = prevIndex(beginInsertRight);
    }

    private int prevIndex(int begin) {
        if ((begin-1) < 0) {
            return size;
        }

        return begin-1;
    }

    public T removeRight() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeLeft(){
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list[size-1];
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
