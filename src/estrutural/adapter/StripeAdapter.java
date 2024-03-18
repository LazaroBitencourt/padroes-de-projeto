package estrutural.adapter;

public class StripeAdapter implements Pagamento {

  private final Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    public void ProcessaPagamento(String montante) {
        stripe.fazerPagamento(montante);
    }
}
