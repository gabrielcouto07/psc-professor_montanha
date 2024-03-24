import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double nota;

            do {
                System.out.print("Digite uma nota entre zero e dez: ");
                nota = scanner.nextDouble();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Valor inválido. Por favor, digite novamente.");
                }
            } while (nota < 0 || nota > 10);

            System.out.println("Nota válida digitada: " + nota);
        }
    }
}