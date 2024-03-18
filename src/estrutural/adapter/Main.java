package estrutural.adapter;

public class Main {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.ProcessaPagamento("2000");

        Stripe stripe = new Stripe();
        StripeAdapter stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.ProcessaPagamento("2000");
    }
}
