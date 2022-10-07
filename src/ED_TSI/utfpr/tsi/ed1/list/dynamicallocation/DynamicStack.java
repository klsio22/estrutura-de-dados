package ED_TSI.utfpr.tsi.ed1.list.dynamicallocation;
/**
 * Implementação de um tipo abstrato de dados - Pilha
 * utilizando uma estrutura de dados com alocação dinâmica (lista encadeada)
 *
 * @author Renata Stange
 */

import ED_TSI.utfpr.tsi.ed1.list.adt.Stack;
import ED_TSI.utfpr.tsi.ed1.list.dynamicallocation.linkedlist.Link;

public class DynamicStack implements Stack<String> {

    Link top;
    int size;

    public DynamicStack() {
        this.top = null;
        this.size=0;
    }

    @Override
    public void push(String e) {
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

    @Override
    public String peek() {
        return top.data.toString();
    }
    @Override
    public String pop() {
        if(!isEmpty()){
            Link aux = top;
            top=aux.next;
            this.size=size-1;
            return aux.data.toString();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public int size() {
        return this.size;
    }
}
