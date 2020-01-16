package lesson5.KnapsackProblem;

public class KnapsackProblem {
    private int knapsackCapacity;
    Box[] boxes;

    public KnapsackProblem(int knapsackCapacity, Box[] boxes) {
        this.boxes = boxes;
        this.knapsackCapacity = knapsackCapacity;
    }

    public int countPrice() {
        return findMaxValue(boxes.length - 1, knapsackCapacity);
    }

    private int findMaxValue(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (boxes[i].getWeight() > weight) {
            return findMaxValue(i - 1, weight);
        } else {
            int a = findMaxValue(i - 1, weight);
            int b = findMaxValue(i - 1, weight - boxes[i].getWeight()) + boxes[i].getValue();
            return Math.max(a, b);
        }
    }
}
