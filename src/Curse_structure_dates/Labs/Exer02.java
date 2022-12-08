package Curse_structure_dates.Labs;

import Curse_structure_dates.Stack.Stack;

import java.util.Scanner;

public class Exer02 {
  public static void main(String[] args) {
    Stack<Integer> pair = new Stack<>();
    Stack<Integer> odd = new Stack<>();

    Scanner scan = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
      System.out.print("Entre com um número: ");
      int num = scan.nextInt();

      //Pilha par
      if (num == 0) {
        Integer unstack = pair.unstack();

        if (unstack == null) {
          System.out.println("Pilha par vazia");
        } else {
          System.out.println("Desempilhando da pilha par: " + unstack);
        }

        // Pilha impar
        unstack = odd.unstack();

        if (unstack == null) {
          System.out.println("Pilha ímpar vazia");
        } else {
          System.out.println("Desempilhando da pilha ímpar: " + unstack);
        }


      } else if (num % 2 == 0) {
        System.out.println("Número par , empilhando na pilha par: " + num);
        pair.stackUP(num);
      } else {
        System.out.println("Número ímpar , empilhando na pilha ímpar: ");
        odd.stackUP(num);
      }

    }

    //-----
    System.out.println(pair);
    System.out.println("Desempenhado todos os números da pilha par");
    while (!pair.isEmpty()) {
      System.out.println("Desempenhando um elemento da pilha par: " + pair.unstack());
    }
    System.out.println("Desempenhado todos os números da pilha par");

    //----
    System.out.println(odd);
    while (!odd.isEmpty()) {
      System.out.println("Desempenhando um elemento da pilha ímpar: " + odd.unstack());
    }
    System.out.println("Desempenhado todos os números da pilha ímpar");


  }
}
