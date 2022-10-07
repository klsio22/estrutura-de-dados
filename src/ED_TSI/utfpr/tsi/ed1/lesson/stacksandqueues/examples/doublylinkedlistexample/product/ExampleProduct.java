package ED_TSI.utfpr.tsi.ed1.lesson.stacksandqueues.examples.doublylinkedlistexample.product;

public class ExampleProduct {
    public static void main(String args[]) {

            System.out.println("***Atividade 4.1***");

            Product p1 = new Product(1, "Arroz", 25.0);
            Product p2 = new Product(2, "Feijão", 9.50);
            Product p3 = new Product(3, "Macarrão", 5.00);
            Product p4 = new Product(4, "Açucar", 3.20);
            Product p5 = new Product(5, "Sal", 1.99);


            System.out.println("***Armazenar produtos na lista ***");

            DoublyLinkedListProduct pq = new DoublyLinkedListProduct();
            pq.insertTail(p3);
            System.out.println("Insere pelo fim: " + p3.toString());
            System.out.println("Imprimir os elementos: " + pq.printList().toString());

            pq.insertTail(p4);
            System.out.println("Insere pelo fim: " + p4.toString());
            System.out.println("Imprimir os elementos: " + pq.printList().toString());

            pq.insertHead(p2);
            System.out.println("Insere pelo início: " + p2.toString());
            System.out.println("Imprimir os elementos: " + pq.printList().toString());


            pq.insertHead(p1);
            System.out.println("Insere pelo início: " + p1.toString());
            System.out.println("Imprimir os elementos: " + pq.printList().toString());

            System.out.println("***Inverte a lista***");
            pq.reverse();

            System.out.println("Imprimir os elementos: " + pq.printList().toString());

            System.out.println("***Remove produtos na lista ***");
            System.out.println("Remove pelo início: ");
            pq.removeHead();
            System.out.println("Imprimir os elementos: " + pq.printList().toString());

            System.out.println("Remove pelo fim: ");

            pq.removeTail();
            System.out.println("Imprimir os elementos: " + pq.printList().toString());

            pq.insertHead(p5);
            System.out.println("Insere pelo início: " + p5.toString());
            System.out.println("Imprimir os elementos: " + pq.printList().toString());


            System.out.println("Imprimir os elementos: " + pq.printList().toString());

            System.out.println("***Inverte a lista***");
            pq.reverse();

            System.out.println("Imprimir os elementos: " + pq.printList().toString());


            pq.removeLink(2);
            System.out.println("Remove id=2");

            System.out.println("Imprimir os elementos: " + pq.printList().toString());


            pq.removeLink(5);
            System.out.println("Remove id=5");

            System.out.println("Imprimir os elementos: " + pq.printList().toString());

        }

    }

