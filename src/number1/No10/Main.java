package number1.No10;

public class Main {
    public static int m() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
