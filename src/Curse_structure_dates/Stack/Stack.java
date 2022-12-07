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

  public Type stackTop() {
    if (this.isEmpty()) {
      return null;
    }
    return this.elements[size - 1];
  }

  public Type unstack() {

    if (this.isEmpty()) {
      return null;
    }
    /*
    Type element = this.elements[size - 1];
    size--;
    return element;
    */

    return this.elements[--size];
  }

}

