package Number2.No2;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент массива [" + i + "]: ");
            try {
                array[i] = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: введено не число. Пожалуйста, введите целое число.");
                scanner.nextLine();
                i--;
            }
        }

        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.format("Среднее значение положительных элементов: %.2f%n", average);
        } else {
            System.out.println("Положительные элементы отсутствуют.");
        }
    }
}
