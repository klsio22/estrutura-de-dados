package ED_TSI.utfpr.tsi.ed1.list.staticallocation;

import ED_TSI.utfpr.tsi.ed1.list.adt.Queue;

/**
 * Implementação de um tipo abstrato de dados Fila
 * utilizando uma estrutura de dados com alocação estática (array)
 *
 * @author Renata Stange
 */


public class StaticQueue implements Queue<String> {

    private int head;
    private int tail;
    private int size;
    String[] vector;

    public StaticQueue(int size) {
        this.head = 0;
        this.tail=0;
        this.size=size;
        vector= new String[size];
    }
    @Override
    public void enqueue(String e){
        System.out.println("tail:"+ tail);
        System.out.println("head:"+ head);
        if(tail<size){
            vector[tail]=e;
            tail++;
        }
        else {
            System.out.println("Queue full");
        }
    }
    @Override
    public String dequeue(){
        if(!isEmpty()){
            //System.out.println("tail:"+ tail);
            int aux=head+1;
            //System.out.println("head:"+ aux);
            return vector[head++];
        }
        else{
            return "Queue empty";
        }    }
    @Override
    public boolean isEmpty(){

        return tail==-1;
    }
    @Override
    public int size(){

        return this.size;
    }
    public int lenght(){

        return this.tail-head;
    }
    public String tail(){
        if(!isEmpty()){
            return vector[tail-1];
        }
        else{
            return "Queue empty";
        }
    }
    public String head(){
        if(!isEmpty()){
            return vector[head];
        }
        else{
            return "Queue empty";
        }
    }
}
