package number1.No6;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (Exception e) {
            System.out.println("2");
        }
        System.out.println("4");
    }

}
