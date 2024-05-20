package number1.No2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            System.out.println("1"); // Перемещено перед оператором throw
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }

}
