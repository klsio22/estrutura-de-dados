package Curse_structure_dates.Lessons_Stack;

import Curse_structure_dates.Stack.Stack;

public class Lesson14 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    System.out.println(stack.size());

    for (int i = 1; i <= 15; i++) {
      stack.stackUP(i);
    }

    System.out.println(stack);
    System.out.println(stack.size());

  }
}
