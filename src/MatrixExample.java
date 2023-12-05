import java.util.Scanner;

public class MatrixExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите номер строки для вывода:");
            int rowNumber = Integer.parseInt(scanner.nextLine());

            // Ваш код для ввода матрицы

            // Ваш код для вывода строки с номером rowNumber
            // Предположим, что у вас есть метод printRow(int rowNumber), который выводит строку
            // matrix.printRow(rowNumber);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введите число, а не строку.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: Нет строки с таким номером.");
        } finally {
            scanner.close();
        }
    }
}
