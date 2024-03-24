import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = numero2; i <= numero1; i++) {
                System.out.println(i);
            }
        }
    }
}