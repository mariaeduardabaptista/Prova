import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda{
    
    private LocalDate data;
    private Produto produto;
    private int quantidadeVendida;

    
	
    public Venda(LocalDate data, Produto produto, int quantidadeVendida) {
        this.data = data;
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
    }  

    @Override
    public String toString() {
        DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s", data.format(df), produto, quantidadeVendida);
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData (LocalDate data) {
        this.data = data;
    }
}