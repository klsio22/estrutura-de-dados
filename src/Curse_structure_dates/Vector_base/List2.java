package Curse_structure_dates.Vector_base;

import Curse_structure_dates.Base_structure.StructureStatic;

public class List2<Type> extends StructureStatic<Type> {

  public List2() {
    super();
  }

  public List2(int capacity) {
    super(capacity);
  }

  public boolean add(Type element) {
    return super.add(element);
  }

  public void add(int position, Type element) {
    super.add(position, element);
  }
}

