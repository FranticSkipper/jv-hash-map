package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        MyMap<Car, Integer> myHashMap = new MyHashMap<>();

        for (int i = 0; i < 1000; i++) {
            Car car = new Car("model_" + i, "color_" + i);
            myHashMap.put(car, i);
        }

        for (int i = 0; i < 1000; i++) {
            Integer value = Integer.valueOf(i);
            Car mapValue = new Car("model_" + i, "color_" + i);
            System.out.println(value);
            System.out.println(myHashMap.getValue(mapValue));
        }
    }
}
