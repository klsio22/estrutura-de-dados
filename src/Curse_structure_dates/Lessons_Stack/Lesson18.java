package Curse_structure_dates.Lessons_Stack;

import java.util.Stack;

public class Lesson18 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();

    System.out.println(stack.isEmpty());//true

    stack.push(1);
    stack.push(5);
    stack.push(8);

    System.out.println(stack.isEmpty());//false
    System.out.println(stack.size());//3
    System.out.println(stack); //[1, 5, 8]
    System.out.println(stack.peek());//watch values stack
    System.out.println(stack.pop());//Remove last stack value
    System.out.println(stack);//[1, 5]
  }
}
