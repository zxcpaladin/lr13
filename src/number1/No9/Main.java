package number1.No9;

public class Main {
    public static int m() {
        try {
            System.out.println("0");
            return 55;    // выход из метода
        } catch (Exception e) {
            // Обработка исключения, если оно возникнет
            System.out.println("Exception occurred: " + e.getMessage());
            return -1; // Вернуть другое значение, если нужно
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
