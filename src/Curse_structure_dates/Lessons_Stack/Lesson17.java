package Curse_structure_dates.Lessons_Stack;

import Curse_structure_dates.Stack.Stack;

public class Lesson17 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.stackUP(1);
    stack.stackUP(3);
    stack.stackUP(5);

    System.out.println(stack);

    System.out.println("Desempinhando elemento: " + stack.unstack());
    System.out.println(stack);

  }
}
