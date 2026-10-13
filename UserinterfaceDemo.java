
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}

class MyCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class UserinterfaceDemo {
    public static void main(String[] args) {

        MyCalculator obj = new MyCalculator();

        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Subtraction: " + obj.subtract(10, 5));
    }
}