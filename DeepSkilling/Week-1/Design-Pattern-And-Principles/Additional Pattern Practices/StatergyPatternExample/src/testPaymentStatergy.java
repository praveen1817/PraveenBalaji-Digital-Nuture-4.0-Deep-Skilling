public class testPaymentStatergy {
    public static void main(String[] args) {
        paymentStatergy creditCard=new creditCardPayment();
        paymentStatergy payPal=new payPalPayment();
        paymentContext paymentTypeCreditCard=new paymentContext(creditCard,10000);
        paymentContext paymentTypePayPal=new paymentContext(payPal,10000);
        paymentTypeCreditCard.executePaymentType();
        paymentTypePayPal.executePaymentType();
    }
}
