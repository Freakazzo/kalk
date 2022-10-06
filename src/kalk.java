import java.util.Scanner;

public class kalk {
    public static void main(String[] args) {
        double ch1;
        double ch2;
        double otvet;
        char operation;
        char calculatorOperator = 'c';
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        ch1 = scanner.nextInt();

        System.out.println("Введите операцию (+,-,*,/)");
        operation = scanner.next().charAt(0);

        System.out.println("Введите второе число");
        ch2 = scanner.nextInt();




        switch (operation) {
            case '+':
                otvet = (ch1 + ch2);
                break;
            case '-':
                otvet = (ch1 - ch2);
                break;
            case '*':
                otvet = (ch1 * ch2);
                break;
            case '/':
                otvet = (ch1 / ch2);
                break;
            default:
                System.out.println("Error!");
                return ;
        }
        System.out.println("Ответ");
        System.out.println(ch1 + " " + operation + " " + ch2 + " = " + otvet);
    }
}


