import lesson_3.MyDeque;

public class Main {
    public static void main(String[] args) {
        // строка в обратном порядке
        String string = "qwerty";

        MyDeque<Character> MyDequeChar = new MyDeque<>();
        for (int i = 0; i < string.length(); i++) {
            MyDequeChar.insertLeft(string.charAt(i));
        }

        for (int i = 0; i < string.length(); i++) {
            System.out.println(MyDequeChar.removeLeft());
        }
        System.out.println("");

        // инты в прямом и обатном порядках
        MyDeque<Integer> myDequeInt = new MyDeque<>();
        for (int i = 0; i < 10; i++) {
            myDequeInt.insertLeft(i); // прямой порядок
            //myDequeInt.insertRight(i); // обратный порядок
        }

        int f = 0;
        for (int i = 0; i < 10; i++) {
            //System.out.println(myDequeInt.removeRight()); // прямой порядок
            System.out.println(myDequeInt.removeLeft()); // обратный порядок
        }
    }
}
