package lesson5;

import lesson5.KnapsackProblem.Box;
import lesson5.KnapsackProblem.KnapsackProblem;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));
//        System.out.println(fibo(47));
//        System.out.println(recFibo(10));
//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));
//        System.out.println(recMultipy(3, 8));
//        System.out.println(sumDigit(46723));
//        System.out.println(recSumDigit(46723));

//      --------------------------------
        System.out.println(recPow(2,6));

        KnapsackProblem knapsackProblem = new KnapsackProblem(20, new Box[]{new Box(10, 18), new Box(11, 20), new Box(12, 17),
                new Box(13, 19), new Box(14, 25), new Box(15, 21), new Box(16, 27), new Box(17, 23),
                new Box(18, 25), new Box(19, 24)});

        System.out.println(knapsackProblem.countPrice());
    }

    static int fact(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    static int recFact(int n) {
        if (n <= 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    static int recMultipy(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultipy(a, b - 1) + a;
    }

    static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int recSumDigit(int n) {
        if (n < 10) {
            return n;
        }
        return recSumDigit(n / 10) + n % 10;
    }

    static int recPow(int number, int power) {
        if (power == 1) {
            return number;
        }

        return recPow(number, power-1) * number;
    }
}
