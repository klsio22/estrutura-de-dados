package ED_TSI.utfpr.tsi.ed1.lesson.stacksandqueues.examples.doublylinkedlistexample.product;

public class DoublyLinkProduct {
    public DoublyLinkProduct prev;
    public DoublyLinkProduct next;
    public Product data;
    public DoublyLinkProduct (Product data){
        this.data = data;
        prev = null;
        next = null;
    }
    @Override
    public String toString() {
        return data.toString();
    }
}
