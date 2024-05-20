package Number2.No3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);
        } else {
            System.out.println("Положительные элементы отсутствуют.");
        }
    }
}

