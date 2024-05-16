import java.util.Scanner;
//Необходимо выполнить с использованием языка программирования Java (11 версия).
//
//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
// "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
//
//2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений:
// "Строки неидентичны" или "Строки идентичны"
//
//3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
// Необходимо написать программу, которая выведет в консоль все чётные числа.

public class Zholobov_java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер задания от 1 до 3:");
        if (!sc.hasNextInt()) {
            System.out.println("Извините, но это не число. Попробуйте снова!");
            return;
        }
        int task = sc.nextInt();
        if(task == 1) {
            // Ввод двух целых чисел с условиями
            System.out.println("Введите два целых числа:");
            if (!sc.hasNextInt()) {
                System.out.println("Извините, но это не число. Попробуйте снова!");
                return;
            }
            int a = sc.nextInt();
            if (!sc.hasNextInt()) {
                System.out.println("Извините, но это не число. Попробуйте снова!");
                return;
            }
            int b = sc.nextInt();
            // Сравнение чисел и вывод результата
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
            // Операции сложения, вычитания, деления и умножения и вывод результатов
            System.out.println("Сложение: " + (a + b));
            System.out.println("Вычитание: " + (a - b));

            // Проверка деления на ноль
            if (b != 0) {
                System.out.println("Деление: " + ((double) a / b));
            } else {
                System.out.println("Деление на ноль невозможно");
            }

            System.out.println("Умножение: " + (a * b));
        }
        if (task == 2) {
            // Ввод двух целых чисел с условиями
            System.out.println("Введите два целых числа:");
            if (!sc.hasNextInt()) {
                System.out.println("Извините, но это не число. Попробуйте снова!");
                return;
            }
            int a = sc.nextInt();
            if (!sc.hasNextInt()) {
                System.out.println("Извините, но это не число. Попробуйте снова!");
                return;
            }
            int b = sc.nextInt();
            //Вывод индентичных или неидентичных строк
            if (a == b){
                System.out.println("Строки идентичны");
            }else {
                System.out.println("Строки неидентичны");
            }
        }
        if (task == 3) {
            // Заданный массив целых чисел
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Вывод четных чисел из массива
            System.out.println("Четные числа из массива:");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }

    }
}