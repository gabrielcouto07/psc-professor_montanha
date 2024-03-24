import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String nome;
            do {
                System.out.print("Digite o nome (maior que 3 caracteres): ");
                nome = scanner.nextLine();
            } while (nome.length() <= 3);

            int idade;
            do {
                System.out.print("Digite a idade (entre 0 e 150): ");
                idade = scanner.nextInt();
            } while (idade < 0 || idade > 150);

            double salario;
            do {
                System.out.print("Digite o salário (maior que zero): ");
                salario = scanner.nextDouble();
            } while (salario <= 0);

            char sexo;
            do {
                System.out.print("Digite o sexo (f ou m): ");
                sexo = scanner.next().charAt(0);
                sexo = Character.toLowerCase(sexo);
            } while (sexo != 'f' && sexo != 'm');

            char estadoCivil;
            do {
                System.out.print("Digite o estado civil (s, c, v ou d): ");
                estadoCivil = scanner.next().charAt(0);
                estadoCivil = Character.toLowerCase(estadoCivil);
            } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

            int populacao;
            do {
                System.out.print("Digite a população (maior que zero): ");
                populacao = scanner.nextInt();
            } while (populacao <= 0);

            double taxaCrescimento;
            do {
                System.out.print("Digite a taxa de crescimento (maior que zero): ");
                taxaCrescimento = scanner.nextDouble();
            } while (taxaCrescimento <= 0);

            System.out.println("\nInformações válidas inseridas:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salário: " + salario);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado Civil: " + estadoCivil);
            System.out.println("População: " + populacao);
            System.out.println("Taxa de Crescimento: " + taxaCrescimento);

            System.out.print("\nDeseja inserir novas informações? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
    }
}