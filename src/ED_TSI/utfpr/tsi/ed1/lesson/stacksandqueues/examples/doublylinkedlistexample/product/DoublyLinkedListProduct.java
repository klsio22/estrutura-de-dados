package ED_TSI.utfpr.tsi.ed1.lesson.stacksandqueues.examples.doublylinkedlistexample.product;

public class DoublyLinkedListProduct {
    DoublyLinkProduct head;
    DoublyLinkProduct tail;

    public DoublyLinkedListProduct(){
        head = null;
        tail=null;
    }

    public void insertTail(Product elem){
        DoublyLinkProduct link = new DoublyLinkProduct(elem);
        if(head == null){
            head = link;
        }
        else {
            DoublyLinkProduct aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next  = link;
            link.prev = aux;
        }
    }
    public void insertHead(Product elem){
        DoublyLinkProduct link = new DoublyLinkProduct(elem);
        if(head == null){
            tail = link;
        }
        else{
            head.prev=link;
            link.next = head;
        }
        head = link;
    }

    public void insertBefore(int elem, Product newElem){
        DoublyLinkProduct aux = search(elem);
        DoublyLinkProduct link = new DoublyLinkProduct(newElem);

        if(aux.prev==null){
            aux.prev = link;
            link.next = aux;
            link.prev = null;
            head = link;
        }
        else
        {
            link.next = aux;
            link.prev = aux.prev;
            aux.prev = link;
            link.prev.next = link;
        }

    }
    public void insertAfter(int elem, Product newElem){
        DoublyLinkProduct aux = search(elem);
        DoublyLinkProduct link = new DoublyLinkProduct(newElem);

        if(aux.next==null){
            aux.next = link;
            link.next = null;
            link.prev = aux;
        }

        else{
            link.next = aux.next;
            link.prev = aux;
            aux.next = link;
            link.prev.prev = link;

        }
    }
    public void removeHead(){
        head = head.next;
        head.prev= null;
    }
    public void removeTail(){
        DoublyLinkProduct aux = head;

        if(aux.next==null){
            head = null;
        }
        else {
            while(aux.next != null){
                aux = aux.next;
            }
            aux= aux.prev;
            aux.next = null;
        }
    }

    public void removeLink(int elem){
        for(DoublyLinkProduct aux = head; aux != null; aux = aux.next)
            if (elem == aux.data.getId()) {
                DoublyLinkProduct aux1=aux.prev;
                DoublyLinkProduct aux2=aux.next;
                if(aux1==null){
                    removeHead();
                }
                else {
                    if(aux2==null){
                        removeTail();
                    }
                    else {
                        aux1.next = aux2;
                        aux2.prev= aux1;
                    }
                }
            }
    }

    public boolean find(int elem){
        for(DoublyLinkProduct aux = head; aux != null; aux = aux.next)
            if (elem == aux.data.getId())
                return true;
        return false;
    }

    public DoublyLinkProduct search(int elem){
        for(DoublyLinkProduct aux = head; aux != null; aux = aux.next)
            if (elem == aux.data.getId())
                return aux;
        return null;
    }

    public String printList(){
        if(isEmpty()) return "Lista vazia\n";
        String str = "Lista Duplamente Encadeada: Product";
        for (DoublyLinkProduct aux = head; aux != null; aux = aux.next)
            str+= " "+ aux.data;
        return str + "\n";
    }

    public void replace(double elem, double newElem){
        for(DoublyLinkProduct aux = head; aux != null; aux = aux.next)
            if (elem == aux.data.getPrice())
                aux.data.setPrice(newElem);
    }

    public void reverse(){
        DoublyLinkProduct aux, aux2;

        for(aux = head; aux.next!= null; aux = aux.prev)   {
            aux2= aux.prev;
            aux.prev= aux.next;
            aux.next= aux2;
        }
        aux2= aux.prev;
        aux.prev= aux.next;
        aux.next= aux2;
        head = aux;
    }

    public int length() {
        int length = 0;
        DoublyLinkProduct current = head;
        while(current != null){
            length ++;
            current = current.next;
        }
        return length;
    }

    public boolean isEmpty(){

        return head == null;
    }
}
