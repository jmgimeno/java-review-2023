package nested;

import java.util.Iterator;

public class LinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    private class NodeBad {
        NodeBad next;
        NodeBad previous;
        E elem;
    }

    private static class Node<F> {
        Node<F> next;
        Node<F> previous;
        F elem;
    }

    private class It implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }

    public Iterator<E> iterator() {
        return new It();
    }

    public Iterator<E> iterator2() {
        return new ItStatic(this);
    }

    private static class ItStatic<E> implements Iterator<E> {

        private LinkedList<E>  list;

        public ItStatic(LinkedList<E>  list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
