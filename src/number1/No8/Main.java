package number1.No8;

public class Main {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
            return 42; // Return an arbitrary value
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
