import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        // Вводим левую границу:
        System.out.print("Введите левую границу: ");
        double left = input.nextDouble();
        // Вводим правую границу:
        System.out.print("Введите правую границу: ");
        double right = input.nextDouble();
        // Шаг:
        System.out.print("Введите шаг: ");
        double step = input.nextDouble();
        while (step <= 0)
        {
            System.out.println("Шаг не может быть меньше либо равен нулю");
            System.out.print("Введите шаг: ");
            step = input.nextDouble();
        }
        // Выводим заголовок:
        System.out.println("Аргумент | Значение функции");

        // Цикл для вывода значений функции:
        for (double x = left; x <= right; x += step)
        {
            // Значение функции:
            double result = x * Math.exp(x) + 2 * Math.sin(x) - Math.sqrt(Math.abs(Math.pow(x, 3) - Math.pow(x, 2)));

            // Выводим аргумент и значение функции:
            System.out.printf("x=%.2f   |   y=%.2f%n", x, result);

            // Условие для подсчета положительных значений с четной целой и дробной частями меньше 0,5:
            if (result > 0 && (int)result % 2 == 0 && result % 1 < 0.5) {
                count++;
            }
        }
        // Выводим подходящие значения:
        System.out.println("Количество положительных значений с четной целой и дробной частью < 0.5: " + count);
    }
}