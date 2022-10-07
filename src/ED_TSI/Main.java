package ED_TSI;


import ED_TSI.utfpr.tsi.ed1.list.dynamicallocation.DynamicQueue;
import ED_TSI.utfpr.tsi.ed1.list.dynamicallocation.DynamicStack;
import ED_TSI.utfpr.tsi.ed1.list.staticallocation.StaticQueue;
import ED_TSI.utfpr.tsi.ed1.list.staticallocation.StaticStack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Static Stack Test");
        StaticStack myStaticStack = new StaticStack(3);
        System.out.println("Size?" + myStaticStack.size());
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Empty?" + myStaticStack.isEmpty());
        myStaticStack.push("a");
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Push?" + myStaticStack.peek());
        myStaticStack.push("b");
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Push?" + myStaticStack.peek());
        myStaticStack.push("c");
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Push?" + myStaticStack.peek());
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Empty?" + myStaticStack.isEmpty());
        System.out.println("Pop?" + myStaticStack.peek());
        myStaticStack.pop();
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Pop?" + myStaticStack.peek());
        myStaticStack.pop();
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Pop?" + myStaticStack.peek());
        myStaticStack.pop();
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Size?" + myStaticStack.size());

        System.out.println("Static Queue Test");
        StaticQueue myStaticQueue = new StaticQueue(3);
        System.out.println("Size?" + myStaticQueue.size());
        System.out.println("Lenght?" + myStaticQueue.lenght());
        System.out.println("Empty?" + myStaticQueue.isEmpty());
        myStaticQueue.enqueue("a");
        System.out.println("Enqueue?" + myStaticQueue.tail());
        System.out.println("Lenght?" + myStaticQueue.lenght());
        myStaticQueue.enqueue("b");
        System.out.println("Enqueue?" + myStaticQueue.tail());
        System.out.println("Lenght?" + myStaticQueue.lenght());
        myStaticQueue.enqueue("c");
        myStaticQueue.enqueue("c");
        System.out.println("Enqueue?" + myStaticQueue.tail());
        System.out.println("Lenght?" + myStaticQueue.lenght());
        System.out.println("Empty?" + myStaticQueue.isEmpty());
        System.out.println("Dequeue?" + myStaticQueue.head());
        myStaticQueue.dequeue();
        System.out.println("Lenght?" + myStaticQueue.lenght());
        System.out.println("Dequeue?" + myStaticQueue.head());
        myStaticQueue.dequeue();
        System.out.println("Lenght?" + myStaticQueue.lenght());
        System.out.println("Dequeue?" + myStaticQueue.head());
        System.out.println("Lenght?" + myStaticStack.lenght());
        myStaticQueue.dequeue();
        System.out.println("Lenght?" + myStaticStack.lenght());
        System.out.println("Size?" + myStaticStack.size());

        System.out.println("Dynamic Queue Test");
        DynamicStack myDynamicStack = new DynamicStack();
        System.out.println("Size?" + myDynamicStack.size());
        System.out.println("Empty?" + myDynamicStack.isEmpty());
        myDynamicStack.push("a");
        System.out.println("Push?" + myDynamicStack.peek());
        System.out.println("Size?" + myDynamicStack.size());
        myDynamicStack.push("b");
        System.out.println("Push?" + myDynamicStack.peek());
        System.out.println("Size?" + myDynamicStack.size());
        myDynamicStack.push("c");
        System.out.println("Push?" + myDynamicStack.peek());
        System.out.println("Size?" + myDynamicStack.size());
        System.out.println("Empty?" + myDynamicStack.isEmpty());
        System.out.println("Pop?" + myDynamicStack.peek());
        myDynamicStack.pop();
        System.out.println("Size?" + myDynamicStack.size());
        System.out.println("Pop?" + myDynamicStack.peek());
        myDynamicStack.pop();
        System.out.println("Size?" + myDynamicStack.size());
        System.out.println("Pop?" + myDynamicStack.peek());
        myDynamicStack.pop();
        System.out.println("Size?" + myDynamicStack.size());

        System.out.println("Dynamic Queue Test");
        DynamicQueue myDynamicQueue = new DynamicQueue();
        System.out.println("Size?" + myDynamicQueue.size());
        System.out.println("Empty?" + myDynamicQueue.isEmpty());
        myDynamicQueue.enqueue("a");
        System.out.println("Enqueue?" + myDynamicQueue.getTail());
        myDynamicQueue.enqueue("b");
        System.out.println("Enqueue?" + myDynamicQueue.getTail().toString());
        myDynamicQueue.enqueue("c");
        System.out.println("Enqueue?" + myDynamicQueue.getTail().toString());
        System.out.println("Empty?" + myDynamicQueue.isEmpty());
        System.out.println("Dequeue?" + myDynamicQueue.getHead().toString());
        myDynamicQueue.dequeue();
        System.out.println("Dequeue?" + myDynamicQueue.getHead().toString());
        myDynamicQueue.dequeue();
        System.out.println("Dequeue?" + myDynamicQueue.getHead().toString());
        myDynamicQueue.dequeue();
        System.out.println("Size?" + myDynamicQueue.size());
    }
}