import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        char operand1;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        number1 = scanner.nextDouble();
        System.out.println("Введите действие (+,-,/,*): ");
        operand1 = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        number2 = scanner.nextDouble();

        switch (operand1) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;

            default:
                System.out.println("Вы ввели неправильное математическое действие.");
                return;

        }

        scanner.close();
        System.out.println("Ваш ответ равен :" + result);
    }
}
