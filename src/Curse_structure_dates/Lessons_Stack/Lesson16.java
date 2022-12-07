package Curse_structure_dates.Lessons_Stack;

import Curse_structure_dates.Stack.Stack;

public class Lesson16 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    System.out.println(stack.stackTop());
    System.out.println(stack);

    stack.stackUP(1);
    stack.stackUP(6);
    stack.stackUP(7);
    System.out.println(stack.stackTop());
    System.out.println(stack);
  }
}
