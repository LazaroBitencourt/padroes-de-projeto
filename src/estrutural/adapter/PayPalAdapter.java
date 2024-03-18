package estrutural.adapter;

public class PayPalAdapter implements Pagamento {
    private final PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void ProcessaPagamento(String montante) {
        payPal.enviarPagamento(montante);
    }
}
