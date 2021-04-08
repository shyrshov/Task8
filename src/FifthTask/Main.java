package FifthTask;

public class Main {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());;
            System.out.println("Exception thrown");
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }

}
