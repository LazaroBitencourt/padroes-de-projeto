package builder;



public class PedidoBuilder {
    private Pedido pedido;

    public PedidoBuilder(){
        this.pedido = new Pedido();
    }

    public PedidoBuilder setNumero(String numero){
        this.pedido.setNumero(numero);
        return this;
    }
    public PedidoBuilder setCliente(int codigo, String nome,String telefone){
        this.pedido.setCliente(new Cliente(codigo,nome,telefone));
        return this;
    }
    public PedidoBuilder setVendedor(int codigo, String nome){
        this.pedido.setVendedor(new Vendedor(codigo,nome));
        return this;
    }

    public PedidoBuilder setProduto(String nome, int quantidade, double valor){
        this.pedido.addProduto(new Produto(nome,quantidade,valor));
        return this;
    }
    public Pedido builder(){
        return pedido;
    }
}