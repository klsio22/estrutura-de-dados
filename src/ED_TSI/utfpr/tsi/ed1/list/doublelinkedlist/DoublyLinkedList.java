package ED_TSI.utfpr.tsi.ed1.list.doublelinkedlist;

import ED_TSI.utfpr.tsi.ed1.list.dynamicallocation.linkedlist.DoublyLink;

import java.util.Objects;

public class DoublyLinkedList {
    DoublyLink head;
    DoublyLink tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertTail(Object elem) {
        DoublyLink link = new DoublyLink(elem);
        if (head == null) {
            head = link;
            tail = link;
        } else {
            DoublyLink aux = tail;
            tail = link;
            aux.next = tail;
            tail.prev = aux;
        }
    }

    public void insertHead(Object elem) {
        DoublyLink link = new DoublyLink(elem);
        if (head == null) {
            head = link;
            tail = link;
        } else {
            DoublyLink aux = head;
            head = link;
            aux.prev = head;
            head.next = aux;
        }
    }

    public void removeHead() {
        DoublyLink aux = head;
        head = aux.next;
        head.prev = null;
    }

    public void removeTail() {
        DoublyLink aux = tail;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            tail = aux.prev;
            tail.next = null;
        }
    }

    public String printList() {
        if (isEmpty()) return "Lista vazia\n";
        String str = "Lista Duplamente Encadeada:";
        for (DoublyLink aux = head; aux != null; aux = aux.next)
            str += " " + aux.data;
        return str + "\n";
    }

    public void reverse() {
        DoublyLink temp = null;
        DoublyLink current = head;
        DoublyLink newhead = tail, newtail = head;

        while (current != null) {
            System.out.println("Current:" + current.data);
            System.out.println("Current.prev:" + current.prev);
            System.out.println("Current.next:" + current.next);
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        head = newhead;
        tail = newtail;
    }

    public boolean find(String elem) {
        for (DoublyLink aux = head; aux != null; aux = aux.next)
            if (Objects.equals(aux.data, elem))
                return true;
        return false;
}
    public DoublyLink search(String elem){
        for (DoublyLink aux = head; aux != null; aux = aux.next)
            if(Objects.equals(aux.data, elem))
                return aux;
        return null;
    }
    public int size() {
        int length = 0;
        DoublyLink current = head;
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
