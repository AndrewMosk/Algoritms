import lesson_2.Sort;

public class Main {
    public static void main(String[] args) {
        Sort sort = new Sort(100000);

        long startTime = System.currentTimeMillis();
        sort.selectionSort();
        double time = (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println("Сортировка выбором " + time + " секунд");

        startTime = System.currentTimeMillis();
        sort.insertionSort();
        time = (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println("Сортировка вставкой " + time + " секунд");

        startTime = System.currentTimeMillis();
        sort.bubbleSort();
        time = (System.currentTimeMillis() - startTime) / 1000.0;
        System.out.println("Сортировка пузырьком " + time + " секунд");

//      Сортировка выбором 12 - 15 секунд
//      Сортировка вставкой 11 - 15 секунд
//      Сортировка пузырьком 45 - 49 секунд
    }
}
