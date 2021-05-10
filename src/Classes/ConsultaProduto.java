import java.util.Scanner;
import java.util.List;

public class ConsultaProduto{

    public void exibirProduto(List<Produto> produtos, Scanner ler) {
        System.out.println("Digite codigo do produto que deseja consultar?");
        int opc = ler.nextInt();
        ler.nextLine();

        for(Produto produto : produtos){
            if (produto.getCodigo() == opc) {
                System.out.println(produto);
                break;
            }
        }

        
    }
}