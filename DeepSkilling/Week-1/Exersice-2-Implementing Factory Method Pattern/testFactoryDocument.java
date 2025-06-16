public class testFactoryDocument {
    public static void main(String[] args) {
        documentFactory word= new wordFactory();
        document wordDoc=word.createDocument();
        wordDoc.openFile();
        documentFactory pdf= new pdfFactory();
        document pdfFile=pdf.createDocument();
        pdfFile.openFile();
        documentFactory excel= new excelFactory();
        document excelFile=excel.createDocument();
        excelFile.openFile();


    }
}
