import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добре дошли в калкулатора!");
        System.out.print("Моля, въведете първо число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Моля, въведете второ число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Изберете операция: +, -, *, или /");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Деление на нула не е позволено.");
                    return;
                }
                break;
            default:
                System.out.println("Невалидна операция.");
                return;
        }

        System.out.println("Резултатът е: " + result);
    }
}

