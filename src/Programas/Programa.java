import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0, opcMenu = 0;
        Menus menu = new Menus();
        List<Produto> listaProd = new ArrayList<>(); 
        

        menu.menuPrincipal();
        opcao = ler.nextInt();

        do{ 
        switch(opcao){
            case 1:
            opcMenu = 0;
            do{
            opcMenu = menu.menuProduto(ler);
            System.out.println("Usuario escolheu a opçao " + opcMenu);
            if(opcMenu == 2){
                Produto prod;
                CadastroProduto cad = new CadastroProduto();
                prod = cad.cadastroProduto(ler);
                listaProd.add(prod);

            } else if(opcMenu == 1){
                ConsultaProduto con = new ConsultaProduto();
                con.exibirProduto(listaProd, ler);

            }} while(opcMenu != 0);

            break;

            case 2:
            opcMenu = 0;
            do{
                opcMenu = menu.menuRelatorio(ler);
                System.out.println("Usuario escolheu a opção" + opcMenu);
                if(opcMenu == 2){

                }
            }while(opcMenu != 0);

            break;

            case 3:

             opcMenu = 0;
            do{
                opcMenu = menu.menuVenda(ler);
                System.out.println("Usuario escolheu a opção" + opcMenu);
                if(opcMenu == 2){
                    Venda vend;
                RealizarVenda rv = new RealizarVenda();
                vend = rv.realizarVenda(ler);
                


                }
            }while(opcMenu != 0);

            case 0:
            System.out.println("Encerrando");

            default:
          System.out.println("Opção digitada invalida");

        }} while(opcao != 0);

        ler.close();


    }

}