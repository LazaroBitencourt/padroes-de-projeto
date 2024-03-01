package builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numero;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String numero, Cliente clinte, Vendedor vendedor, List<Produto> produtos) {
        this.numero = numero;
        this.cliente = clinte;
        this.vendedor = vendedor;
        this.produtos = produtos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getClinte() {
        return cliente;
    }

    public void setCliente(Cliente clinte) {
        this.cliente = clinte;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

     private double valorTotal(){
     return produtos.stream().mapToDouble(p -> p.getValor()).sum() * produtos.size();
     }

    @Override
    public String toString() {
        return "************************************************\n" +
               "               pedido  " + numero + "               \n" +
                "************************************************\n"+
                "Código: "+ cliente.getCodigo()+ " Cliente: " + cliente.getNome() + "\n"+
                "Código: "+ vendedor.getCodigo()+ " Vendedor: " + vendedor.getNome() + "\n"+
                "Produto: "+ produtos.get(0).getNome()+ " Qtde: "+ produtos.get(0).getQuantidade()+ " valor: "+ produtos.get(0).getValor()+ "\n"+
                "Produto: "+ produtos.get(1).getNome()+ " Qtde: "+ produtos.get(1).getQuantidade()+ " valor: "+ produtos.get(1).getValor()+ "\n"+
                "Qtde de produtos: "+ produtos.size() +"\n"+
                "Total: "+ valorTotal();


    }
}
