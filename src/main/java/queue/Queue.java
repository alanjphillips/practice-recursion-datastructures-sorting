package queue;


public class Queue<E> {

    private Node<E> head = null;
    private Node<E> tail = null;

    private int size = 0;

    public void enqueue(E e) {
        Node<E> node = new Node<>(e, null);

        if (size == 0) {
            tail = node;
            head = tail;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public E dequeue() {
        if (head == null) {
            return null;
        }

        E result = head.getElement();
        head = head.getNext();
        size--;

        return result;
    }

    public int getSize() {
        return size;
    }

    static class Node<E> {
        private E element;

        private Node<E> next;

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

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
