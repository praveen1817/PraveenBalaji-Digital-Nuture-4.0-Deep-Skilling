public class pdfFactory extends documentFactory{
    @Override
    public document createDocument() {
        return new pdfDocument();
    }
}
