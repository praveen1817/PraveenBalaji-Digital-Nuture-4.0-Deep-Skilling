public class testDependancyInjection {
    public static void main(String[] args) {
        customerRepository customer =new customerRepositoryImpl();
        customerService display=new customerService(customer);
        display.displayCustomerDetail();


    }
}
