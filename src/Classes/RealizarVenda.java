    import java.util.Scanner;

    public class RealizarVenda {

        public Venda realizarVenda(Scanner ler){
        System.out.println("Codigo do produto que deseja comprar");
        int cod = ler.nextInt();
        ler.nextLine(); 
        System.out.println("Quantidade" );
        int quantd = ler.nextInt();
        ler.nextLine();
        System.out.println("Data da venda" );
        int dt = ler.nextInt();
        ler.nextLine();
        System.out.println("compra realizada com sucesso!!");

        return new Venda(dt, quantd, cod);

        }
        
    }
    
