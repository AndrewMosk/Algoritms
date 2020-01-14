package lesson4;

public class Main {
    public static void main(String[] args) {

        MyLinkedStack<String> stack = new MyLinkedStack<>();
        stack.push("Katia");
        stack.push("Maria");
        stack.push("Luba");
        stack.push("Sveta");
        stack.push("Natasha");

        System.out.println(stack.peek());

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
