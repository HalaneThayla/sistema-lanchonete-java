import java.util.ArrayList;
import java.util.Scanner;

public class Servicos {

    Scanner scanner = new Scanner(System.in);

    public Produto adicionarProduto(int id) {

        System.out.println();
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Produto(id, nome, valor);

        System.out.println();
        System.out.println("Produto adicionado com sucesso! ");
        System.out.println();

        return produto;
    }

    public void listarProdutos(ArrayList<Produto> produtos) {

        if (produtos.isEmpty()) {
            System.out.println(" Não tem nenhum produto cadastrado");
            return;
        }

        System.out.println();
        System.out.println("Lista de produtos");

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).toString());
        }

        System.out.println();
    }
}
