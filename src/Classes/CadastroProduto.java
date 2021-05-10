import java.util.Scanner;

public class CadastroProduto {

    public Produto cadastroProduto(Scanner ler){
        System.out.println("Informe o codigo do produto:");
        int cod = ler.nextInt();
        ler.nextLine();
        System.out.println("Informe nome do produto:");
        String nome =ler.nextLine();
        System.out.println("informe o valor do produto:");
        double valor = ler.nextDouble();
        System.out.println("informe quantidade em estoque:");
        int estoque = ler.nextInt();
        ler.nextLine();
        return new Produto(cod, nome, valor, estoque);


    }
    
    
}
