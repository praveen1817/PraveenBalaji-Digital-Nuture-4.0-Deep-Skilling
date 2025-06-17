public class paymentContext {
    private paymentStatergy PaymentStatergy;
    float amount;
    public paymentContext(paymentStatergy PaymentStatergy,float amount){
        this.PaymentStatergy=PaymentStatergy;
        this.amount=amount;
    }
    public void executePaymentType(){
        PaymentStatergy.pay(amount);
    }

}
