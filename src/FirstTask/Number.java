package FirstTask;

public class Number {

    int one;

    public Number(int one) {
        this.one = one;
    }

    void method (int number) {
        if (number < 0) {
            System.out.println("Number < 0");
        } else {
            if (number > 0) {
                System.out.println("Number > 0");
            } else {
                throw new ArithmeticException("Number = 0");
            }
        }

    }

    public static void main (String[] args) {
        Number number = new Number(0);
        number.method(number.one);
    }

}
