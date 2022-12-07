package Curse_structure_dates.Base_structure;

public class StructureStatic<Type> {
  protected Type[] elements;
  protected int size;

  protected StructureStatic(int capacity) {
    this.elements = (Type[]) new Object[capacity];
    this.size = 0;
  }

  protected StructureStatic() {
    this(10);
  }

  protected boolean add(Type element) {
    this.increaseCapacity();
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size++;
      return true;
    }
    return false;
  }

  protected void add(int position, Type element) {

    if (!(position >= 0 && position < size)) {
      throw new IllegalArgumentException("Posição inválida");
    }
    this.increaseCapacity();
    //this.size-1 start in size minus 1
    for (int i = this.size - 1; i >= position; i--) {
      this.elements[i + 1] = this.elements[i];
    }
    this.elements[position] = element;
    this.size++;
  }

  private void increaseCapacity() {
    if (this.size == this.elements.length) {
      Type[] newElements = (Type[]) new Object[this.elements.length * 2];
      for (int i = 0; i < this.elements.length; i++) {
        newElements[i] = this.elements[i];
      }
      this.elements = newElements;
    }
  }

  public boolean isEmpty() {
    return this.size() == 0;
  }

  public int size() {
    return this.size;
  }

  @Override
  public String toString() {
    StringBuilder text = new StringBuilder();
    text.append('[');
    for (int i = 0; i < this.size - 1; i++) {
      text.append(this.elements[i]);
      text.append(", ");
    }
    if (this.size > 0) {
      text.append(this.elements[this.size - 1]);
    }
    text.append(']');
    return text.toString();

  }

}
