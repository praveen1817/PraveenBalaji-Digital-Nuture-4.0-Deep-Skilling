public class payPalPayment implements paymentStatergy{
    @Override
    public void pay(float amount) {
        System.out.println("The Payment of "+amount+"$ is Done using PayPal");
    }
}
