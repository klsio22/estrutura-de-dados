package ED_TSI.utfpr.tsi.ed1.lesson.stacksandqueues.simplelinkedlistexample.intlist;

public class StackInt {
    Link top;
    int size;

    public StackInt() {
        this.top = null;
        this.size=0;
    }

    public void push(int e) {
        Link newlink = new Link(e);
        if(isEmpty()){
            top=newlink;
        }
        else {
            Link aux=top;
            top=newlink;
            top.next= aux;
        }
        this.size=size+1;
    }

    public int peek() {
        return top.data;
    }
    public int pop() {
        if(!isEmpty()){
            Link aux = top;
            top=aux.next;
            this.size=size-1;
            return aux.data;
        }
        return -1;
    }


    public boolean isEmpty() {
        return top==null;
    }

    public int size() {
        return this.size;
    }
}
