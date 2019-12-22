package lesson_2;

import java.util.Random;

public class Sort {
    private int size;
    private Integer[] array;

    public Sort(int size) {
        this.size = size;
        this.array = new Integer[size];
        fillArray();
    }

    private void fillArray() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private void swap(int index1, int index2, Integer[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void selectionSort() {
        Integer[] sortArray = array.clone();
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if( sortArray[j].compareTo(sortArray[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(i, minIndex, sortArray);
        }
    }

    public void insertionSort(){
        Integer key;
        Integer[] sortArray = array.clone();
        for (int i = 1; i < size ; i++) {
            int j = i;
            key  = sortArray[i];
            while(j > 0 && key.compareTo(sortArray[j - 1]) < 0){
                sortArray[j] = sortArray[j - 1];
                j--;
            }
            sortArray[j] = key;
        }
    }

    public void bubbleSort(){
        Integer[] sortArray = array.clone();
        boolean swapped;
        for (int i = size - 1; i > 0 ; i--) {
            swapped = false;
            for (int j = 0; j < i ; j++) {
                if( sortArray[j + 1].compareTo(sortArray[j]) < 0 ){
                    swap(j + 1, j, sortArray);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
