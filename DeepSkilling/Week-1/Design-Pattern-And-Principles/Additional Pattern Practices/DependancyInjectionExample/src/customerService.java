public class customerService {
    private customerRepository repository;
    public customerService(customerRepository repository){
        this.repository=repository;
    }
    public void displayCustomerDetail(){
        if (repository!=null){
            System.out.println("customer Details:  "+repository.findCustomerId("1A"));
        }
        else{
            System.out.println("inputs not Given");
        }


    }
}
