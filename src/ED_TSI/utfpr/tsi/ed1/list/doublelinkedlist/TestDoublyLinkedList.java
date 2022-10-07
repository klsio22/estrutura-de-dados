package ED_TSI.utfpr.tsi.ed1.list.doublelinkedlist;


public class TestDoublyLinkedList {
    public static void main(String[] args) {

        System.out.println("Doubly Linked List Test");
        System.out.println("Dynamic Queue Test");
        DoublyLinkedList myDynamicList = new DoublyLinkedList();
        System.out.println("Size?" + myDynamicList.size());
        System.out.println("Empty?" + myDynamicList.isEmpty());
        myDynamicList.insertHead("c");
        System.out.println("Add begin?" + myDynamicList.head);
        myDynamicList.insertHead("b");
        System.out.println("Add begin?" + myDynamicList.head);
        myDynamicList.insertHead("a");
        System.out.println("Add begin?" + myDynamicList.head);
        myDynamicList.insertTail("d");
        System.out.println("Add end?" + myDynamicList.tail);
        myDynamicList.insertTail("e");
        System.out.println("Add end?" + myDynamicList.tail);
        myDynamicList.insertTail("f");
        System.out.println("Add end?" + myDynamicList.tail);
        System.out.println("My list?" + myDynamicList.printList());
        System.out.println("Remove head?" + myDynamicList.head);
        myDynamicList.removeHead();
        System.out.println("New head?" + myDynamicList.head);
        System.out.println("Remove tail?" + myDynamicList.tail);
        myDynamicList.removeTail();
        System.out.println("New end?" + myDynamicList.tail);
        System.out.println("My list?" + myDynamicList.printList());
        System.out.println("Find?" + myDynamicList.find("c"));
        System.out.println("Find?" + myDynamicList.find("u"));
        myDynamicList.reverse();
        System.out.println("My list reverse?" + myDynamicList.printList());
        System.out.println("Search?" + myDynamicList.search("e"));
        System.out.println("Search?" + myDynamicList.search("p"));

    }
}
