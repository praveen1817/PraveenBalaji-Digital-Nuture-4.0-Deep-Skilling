public class Customer {
    String customerId;
    String customerName;
    int customernumber;
    String customerEmail;
    public Customer( String customerId,String customerName,int customernumber,String customerEmail){
        this.customerId=customerId;
        this.customerName=customerName;
        this.customernumber=customernumber;
        this.customerEmail=customerEmail;
    }
    @Override
    public String toString(){
        return "CustomerName: "+customerName+
                "/ncutomerId: "+customerId+
                "/nCustomerMobile Number: "+customerName+
                "/ncustomer Email"+customerEmail;
    }
}
