public class FactoryMethodTest {

    public static void main(String[] args) {

        DocumentFactory factory = new DocumentFactory();

        Document word = factory.createDocument("WORD");
        Document pdf = factory.createDocument("PDF");
        Document excel = factory.createDocument("EXCEL");

        word.open();
        pdf.open();
        excel.open();
    }
}