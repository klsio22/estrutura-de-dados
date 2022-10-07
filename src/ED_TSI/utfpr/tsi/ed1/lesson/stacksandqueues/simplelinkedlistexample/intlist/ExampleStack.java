package ED_TSI.utfpr.tsi.ed1.lesson.stacksandqueues.simplelinkedlistexample.intlist;

/**
 * Exemplo de uso de uma implementação de uma Pilha de interiros.
 *
 * @author Renata Stange
 */

public class ExampleStack {

    public static void main(String[] args) {
        StackInt stack = new StackInt();
        QueueInt queue = new QueueInt();
        for (int i = 100; i <= 115; i++) {
            stack.push(i);
        }
        System.out.println("*******************************************");
        for (int j = 1; j <= 30; j++) {
            queue.enqueue(j);
            System.out.println(j + ":" + queue.getTail());
        }
        System.out.println("*******************************************");
        for (int k = 1; k <= 60; k++) {
            queue.enqueue(stack.pop());//remove o elemento do topo da pilha e o insere na fila
            stack.push(queue.dequeue()); //remove o último elemento da fila e o insere na pilha
            System.out.println(k + ":" + queue.getTail());
            System.out.println(k + ":" + stack.peek());
        }

    }


}
