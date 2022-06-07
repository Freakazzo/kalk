import java.util.Scanner;

public class kalk {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        int otvet;
        char operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        operand1 = scanner.nextInt();
        operand2 = scanner.nextInt();
        System.out.println("Vvedite (+,-,*,/)");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                otvet = (operand1 + operand2);
                break;
            case '-':
                otvet = (operand1 - operand2);
                break;
            case '*':
                otvet = (operand1 * operand2);
                break;
            case '/':
                otvet = (operand1 / operand2);
                break;
            default:
                System.out.println("Error!");
                return;
        }
        System.out.println("Rezult");
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + otvet);
    }
}


