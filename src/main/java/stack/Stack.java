package stack;


public class Stack<E> {

    private Node<E> head = null;

    private int size = 0;

    public void push(E e) {
        Node<E> node = new Node<>(e, head);
        head = node;
        size++;
    }

    public E pop() {
        if (head == null) {
            return null;
        }

        E elementToPop = head.getElement();
        head = head.getNext();
        size--;

        return elementToPop;
    }

    public int getSize() {
        return size;
    }

    static class Node<E> {
        private E element;
        private Node next;

        Node(E e, Node n) {
            this.element = e;
            this.next = n;
        }

        public E getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

    }

}
