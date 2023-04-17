package generics;

import java.util.LinkedList;
import java.util.List;

public class Erasure {
    // Esborrat
    static class Node<E> {
        Node<E> next;
        E value;

        public Node(E value) {
            this.value = value;
        }

        public E getValue() {
            return this.value;
        }
    }

    public static void method(String[] args) {
        Node<String> ns = new Node<String>("patata");
        String name = ns.getValue();
        System.out.println(name);

        Node<Integer> ni = new Node<Integer>(42);
        // String name2 = ni.getValue();

        Node n = new Node<String>("patatata");

    }

    static class NodeErased {
        NodeErased next;
        Object value;

        public NodeErased(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return this.value;
        }
    }

    public static void methodErased(String[] args) {
        NodeErased ns = new NodeErased("patata");
        String name = (String) ns.getValue();
        //            ^^^^^^^^ checked cast -> afegeixe compilador

        System.out.println(name);

        Node<Integer> ni = new Node<Integer>(42);
        // String name2 = ni.getValue();
    }

    // Temps d'execució la informació dels genèrics s'ha perdut
    void overloaded(List<String> strings) {

    }

//    void overloaded(List<Integer> ints) {
//
//    }

    void arrayOfGenerics() {
        List<String>[] lists;
        //lists = new List<String>[20];

    }

    static class ArrayList<E> {
        Object[] elems;
        int size;

        public ArrayList() {
            elems = new Object[20];
            size = 0;
        }

        public void add(E e) {
            elems[0] = e;
            // elems[0] = "patata"; // compila però peta
        }

        @SuppressWarnings("unchecked")
        public E get(int i) {
            return (E) elems[i];
            //     ^^^ unchecked cast -> no comprovat pel compilador
        }
    }

    static class ArrayList2<E> {
        E[] elems;
        int size;

        @SuppressWarnings("unchecked")
        public ArrayList2() {
            elems = (E[]) new Object[20];
            size = 0;
        }

        public E get(int i) {
            return elems[i];
        }

        public void add(E e) {
            elems[0] = e;
            // elems[0] = "patata"; // no compila
        }
    }

    static <E> void methodInstanceOf(List<E> l) {
        if (l instanceof ArrayList<?>) {

        } else if (l instanceof LinkedList<?>) {

        }
    }

}
