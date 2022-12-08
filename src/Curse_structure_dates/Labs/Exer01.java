package Curse_structure_dates.Labs;


import Curse_structure_dates.Stack.Stack;

import java.util.Scanner;

public class Exer01 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    Scanner scan = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
      System.out.println("Entre com um número");
      int num = scan.nextInt();

      if (num % 2 == 0) {
        System.out.println("Empinhando o número " + num);
        stack.stackUP(num);
      } else {
        Integer unstack = stack.unstack();
        if (unstack == null) {
          System.out.println("Pilha está vazia");
        } else {
          System.out.println("número ímpar, desempenhando um elemento da pilha: " + unstack);
        }
      }
    }

    System.out.println(stack);
    while (!stack.isEmpty()) {
      System.out.println("Desempenhando um elemento da pilha: " + stack.unstack());
    }

    System.out.println("Todos os elementos foram desempilhados");

  }

}
