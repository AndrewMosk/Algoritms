package lesson6;

public class Main {
    public static void main(String[] args) {
        int key;
        int value;
        var maps = new MyTreeMap[6];

        for (int i = 0; i < 6; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            while (true) {
                if (map.getHeight() < 6) {
                    key = (int) (Math.random() * (201)) - 100;
                    value = (int) (Math.random() * (201)) - 100;

                    map.put(key, value);
                } else {
                    break;
                }
            }

            maps[i] = map;
        }

        for (MyTreeMap map : maps) {
            System.out.println(map.isBalanced());
        }
    }
}
