package ED_TSI.utfpr.tsi.ed1.lesson.stacksandqueues.simplelinkedlistexample.intlist;

public class QueueInt {
    Link head;
   Link tail;
    int size;
    public QueueInt() {
        this.head=null;
        this.tail=null;
        this.size= 0;
    }
    public void enqueue(int e) {
        Link newlink = new Link(e);
        if(isEmpty()){
            head=newlink;
            tail=newlink;
        }
        else {
            Link aux=tail;
            tail=newlink;
            aux.next=tail;
        }
        this.size=size+1;
    }

    public int dequeue() {
        if(!isEmpty()){
            Link aux = head;
            head=aux.next;
            this.size=size-1;
            return aux.data;
        }
        return -1;    }

    public boolean isEmpty() {
        return this.head==null;
    }

    public int size() {
        return this.size;
    }

    public int getHead() {
        return this.head.data;
    }

    public int getTail() {
        return this.tail.data;
    }
}
