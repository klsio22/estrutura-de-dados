package ED_TSI.utfpr.tsi.ed1.list.dynamicallocation;
/**
 * Implementação de um tipo abstrato de dados - Fila
 * utilizando uma estrutura de dados com alocação dinâmica (lista encadeada)
 *
 * @author Renata Stange
 */

import ED_TSI.utfpr.tsi.ed1.list.adt.Queue;
import ED_TSI.utfpr.tsi.ed1.list.dynamicallocation.linkedlist.Link;

public class DynamicQueue implements Queue<String> {
    Link head;
    Link tail;
    int size;
    public DynamicQueue() {
        this.head=null;
        this.tail=null;
        this.size= 0;
    }
    public void enqueue(String e) {
        Link newlink = new Link(e);
        if(isEmpty()){
            head=newlink;
            tail=newlink;
        }
        else {
            Link aux=tail;
            tail=newlink;
            aux.next= tail;
        }
        this.size=size+1;
    }

    public String dequeue() {
        if(!isEmpty()){
            Link aux = head;
            head=aux.next;
            this.size=size-1;
            return aux.data.toString();
        }
        return null;    }

    public boolean isEmpty() {
        return this.head==null;
    }

    public int size() {
        return this.size;
    }

    public String getHead() {
        return this.head.data.toString();
    }

    public String getTail() {
        return this.tail.data.toString();
    }
}
