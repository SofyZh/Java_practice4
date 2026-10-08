//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class MonthDays {
//    public static void main(String[] args) {
//        String[] months = {"январь", "февраль", "март", "апрель", "май",
//                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
//        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        Scanner input = new Scanner(System.in);
//
//        try {
//            System.out.print("Введите номер месяца (1-12): ");
//            int month = input.nextInt();
//
//            System.out.println("Месяц: " + months[month - 1]);
//            System.out.println("Количество дней: " + dom[month - 1]);
//
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Недопустимое число");
//        } catch (InputMismatchException ex) {
//            System.out.println("Ошибка: нужно ввести целое число!");
//        }
//    }
//}

import java.util.Scanner;
import java.util.InputMismatchException;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Введите номер месяца (1-12): ");
            int month = input.nextInt();

            System.out.println("Месяц: " + months[month - 1]);

            if (month == 2) {
                System.out.print("Введите год: ");
                int year = input.nextInt();

                int days = isLeapYear(year) ? 29 : 28;
                System.out.println("Количество дней: " + days);
            } else {
                System.out.println("Количество дней: " + dom[month - 1]);
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Недопустимое число");
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка: нужно ввести целое число!");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}