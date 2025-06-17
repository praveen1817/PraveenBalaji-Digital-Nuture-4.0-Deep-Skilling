public class creditCardPayment implements paymentStatergy{
    @Override
    public void pay(float amount) {
        System.out.println("The Payment of "+amount+"$ is Done using Credit Card");
    }
}
