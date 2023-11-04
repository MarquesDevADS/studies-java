import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double number1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double number2 = scanner.nextDouble();

        double result = number1 + number2;
        System.out.println("Resultado da soma: " + number1 + " + " + number2 + " = " + result);
        System.out.println("Fim do teste!");

        scanner.close();
    }
}
