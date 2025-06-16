public class excelFactory extends documentFactory{
    @Override
    public document createDocument() {
        return new excelDocument();
    }
}
