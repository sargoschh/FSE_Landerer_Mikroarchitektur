/**
 * Wird benötigt, um mit dem StandardReader später Bücher im .pdf Format zu öffnen.
 */
public class PDFReader implements AdvancedEReader{

    @Override
    public void openBookInPDF(String bookName) {
        System.out.println("Opening book as PDF. BookName: " + bookName);
    }

    @Override
    public void openBookInAZW(String bookName) {

    }
}
