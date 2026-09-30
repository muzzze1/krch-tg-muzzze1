package les1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Чтобы посчитать сумму, разность, произведение, частное, остаток и среднее арифметическое чисел а, б и с, то:");
        System.out.print("Выведи А: ");
        int numberA = in.nextInt();
        System.out.print("Выведи В: ");
        int numberB = in.nextInt();
        System.out.println("Выберите действие: 0.Выйти из программы, 1.Сумма , 2.Разность, 3.Произведение, 4.Частное, 5.Остаток, 6.Среднее арифметическое 3 чисел");
        for (int i = 0; i < 10; i++) {
        int vvod = in.nextInt();
        if (vvod == 1) {
            System.out.println("Сумма: " + (numberA + numberB));
        } else if (vvod == 2) {
            System.out.println("Разность: " + (numberA - numberB));
        } else if (vvod == 3) {
            System.out.println("Произведение: " + (numberA * numberB));
        } else if (vvod == 4) {
            System.out.println("Частное: " + (numberA / numberB));
        } else if (vvod == 5) {
            System.out.println("Остаток: " + (numberA % numberB));
        } else if (vvod == 6) {
            System.out.print("Выведи С: ");
            double numberC = in.nextInt();
            System.out.println("Среднее арифметическое: " + ((numberA + numberB + numberC)) / 3);
        }else if (vvod == 0) {
            System.out.printf("Выход из программы...");
            return;
        }else return;
        }
    }
}