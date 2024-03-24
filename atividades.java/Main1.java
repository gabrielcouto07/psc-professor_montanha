import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String username, password;

        do {
            System.out.print("Digite o nome de usuário: ");
            username = scanner.nextLine();

            System.out.print("Digite a senha: ");
            password = scanner.nextLine();

            if (password.equals(username)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        } while (password.equals(username));

        System.out.println("Nome de usuário e senha cadastrados com sucesso.");
    }
}