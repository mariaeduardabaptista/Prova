import java.util.Scanner;
public class Menus {

    int opc;

    public void menuPrincipal(){
        System.out.println("\nEscolha uma opçao:");
        System.out.println("1 - Cadastro de produtos");
        System.out.println("2 - Relatorios");
        System.out.println("3 - Venda");
        System.out.println("0 - Encerrar");
    }
    public int menuProduto(Scanner ler) {
        System.out.println("\nEscolha uma opçao:");
        System.out.println("1 - Consultar");
        System.out.println("2 - Incluir");
        System.out.println("0 - Voltar ao menu anterior");
        opc = ler.nextInt();
        return opc;
    }

    public int menuRelatorio(Scanner ler) {
    System.out.println("1 - Produto");
    System.out.println("2 - Vendas por periodo detalhado");
    System.out.println("3 - Vendas por periodo consolidado");
    System.out.println("0 - Voltar ao menu anterior");
    opc = ler.nextInt();
    return opc; 
    }

    public int menuVenda(Scanner ler) {
        System.out.println("\nDigite nome do produto que deseja compra");
        opc = ler.nextInt();
        return opc;

    
 }
}
