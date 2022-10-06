import java.util.Scanner;

public class kalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ch1;
        double ch2;
        char operation = 0;
        double otvet = 0;
        char calculatorOperator = 'c';


        do {
            if (calculatorOperator == 'c') {
                System.out.println("Введите первое число");
                ch1 = scanner.nextDouble();
                System.out.println("Введите операцию (+,-,*,/)");
                operation = scanner.next().charAt(0);
            } else {
                ch1 = otvet;

            }
            System.out.println("Введите второе число");
            ch2 = scanner.nextDouble();
            otvet = kalkulaytet(ch1, ch2, operation);

            System.out.println(ch1 + " " + operation + " " + ch2 + " = " + otvet);

            calculatorOperator = scanner.next().charAt(0);

        } while (calculatorOperator != 's');

    }

    public static double kalkulaytet(double ch1, double ch2, char operation) {

        return switch (operation) {
            case '+' -> ch1 + ch2;
            case '-' -> ch1 - ch2;
            case '*' -> ch1 * ch2;
            case '/' -> ch1 / ch2;
            default -> {
                System.out.println("Error!");
                yield 0;
            }
        };
    }
}


