package Curse_structure_dates.Stack;

import Curse_structure_dates.Base_structure.StructureStatic;

public class Stack<Type> extends StructureStatic<Type> {
  public Stack() {
    super();
  }

  public Stack(int capacity) {
    super(capacity);
  }

  public void stackUP(Type element) {
    super.add(element);
  }
}
