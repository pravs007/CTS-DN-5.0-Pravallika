interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Creating a Word report...");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Creating a PDF report...");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Creating an Excel report...");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPatternExample {

    public static void main(String[] args) {

        System.out.println("Document Creation System");
        System.out.println("------------------------");

        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}