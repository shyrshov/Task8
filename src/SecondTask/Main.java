package SecondTask;

public class Main {

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        try {
        int a = 5;
        int b = 0;
        return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
