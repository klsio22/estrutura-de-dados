package Vector_base;

import java.lang.reflect.Array;

public class Lists<Type> {

    private Type[] elements;
    private int size;

    public Lists(int capacity) {
        this.elements = (Type[]) new Object[capacity];
        this.size = 0;
    }


    public Lists(int capacity, Class<Type> typeClass) {
        this.elements = (Type[]) Array.newInstance(typeClass, capacity);
        this.size = 0;
    }


    public boolean add(Type element) {
        this.increaseCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    //0 1 2 3 4 5
    //B C E F G . .
    public void add(int position, Type element) {

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
            Type[] newElements = (Type[]) new String[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }


    //B G D E F -> position will be removed is 1(G)
    // 0 1 2 3 4 -> size is 6
    // vector[1] = vector [2]
    // vector[2] =  vector[3]
    // vector[3] = vector[4]
    public void remove(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = position; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public void remove(Type element) {
        int pos = this.search(element);

        if (pos > -1) {
            this.remove(pos);
        }
    }

    public void clear() {
        if (this.size > 0) {
            // this.elements = Type([]) new Object()[this.elements.length];

            this.size = 0;
            for (int i = 0; i < this.size; i++) {
                this.elements[i] = null;
            }
            this.size = 0;
        }
    }

    public int size() {
        return this.size;
    }

    public Type get(int position) {
        return this.search(position);
    }

    public Type search(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elements[position];
    }

    public int search(Type element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndex(Type element) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.elements[i].equals(element))
                return i;
        }
        return -1;
    }

    public boolean contais(Type element) {
        return search(element) > -1; //>=0
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
