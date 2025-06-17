public class customerRepositoryImpl implements customerRepository{
    @Override
    public Customer findCustomerId(String id) {
        return new Customer(id,"Praveen",733,"praveen42165@gmail.com");
    }
}
