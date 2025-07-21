import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        menu (scanner);
    }
    public static int menu(Scanner scanner) {
        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Vender produto");
        System.out.println("[2] Adicionar produto");
        System.out.println("[3] Listar produto");
        System.out.println("[4] Deletar produto");
        System.out.println("[5] Sair (Encerrar programa)");

        int opcao = scanner.nextInt();

        return opcao;

    }
}
