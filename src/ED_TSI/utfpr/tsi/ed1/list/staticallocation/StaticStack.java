package ED_TSI.utfpr.tsi.ed1.list.staticallocation;
/**
 * Implementação de um tipo abstrato de dados - Pilha
 * utilizando uma estrutura de dados com alocação estática (array)
 *
 * @author Renata Stange
 */

import ED_TSI.utfpr.tsi.ed1.list.adt.Stack;

public class
StaticStack implements Stack<String> {

    private int top;
    private int size;
    String[] vector;


    public StaticStack(int size) {
        this.top = -1;
        this.size=size;
        vector= new String[size];
    }

    public void push(String e){

        if(top!=size){
            vector[++top]=e;
        }
    }
    public String peek(){
        if(!isEmpty()){
            return vector[top];
        }
        else{
            return "Stack empty";
        }
    }
    public String pop(){
        if(!isEmpty()){
            return vector[top--];
        }
        else{
            return "Stack empty";
        }
    }
    public boolean isEmpty(){

        return top==-1;
    }
    public int size(){

        return this.size;
    }
    public int lenght(){

        return this.top+1;

    }


}

