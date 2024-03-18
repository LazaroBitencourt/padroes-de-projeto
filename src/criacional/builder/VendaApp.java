package criacional.builder;

import java.math.BigDecimal;

public class VendaApp {
    public static void main(String[] args) {

        Pedido pedido = new PedidoBuilder()
                .setNumero("1234567891")
                .setCliente(100, "Ricardo",  "99988-0000")
                .setVendedor(1, "Mario")
                .setProduto("Notebook",1, 8000.00)
                .setProduto("Iphone", 2, 5000.00)
                .builder();
        System.out.println(pedido);
    }
}
