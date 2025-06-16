public class wordFactory extends documentFactory{
    @Override
    public document createDocument() {
        return new wordDocument();
    }
}
