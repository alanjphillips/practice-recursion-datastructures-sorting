package linkedlist;


public class LinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;

    private int size = 0;

    public void addFirst(E element) {
        Node n = new Node(element, head);
        head = n;

        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E element) {
        Node n = new Node(element, null);

        if (size == 0) {
            tail = n;
            head = tail;
        } else {
            tail.setNext(n);
            tail = n;
        }

        size++;
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.getElement();
        }
    }

    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.getElement();
        }
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        }
        Node<E> first = head;
        head = head.getNext();
        size--;

        if (size == 0) {
            tail = null;
        }

        return first.getElement();
    }

    public int getSize() {
        return size;
    }

    static class Node<E> {
        private E element;
        private Node<E> next;

        Node(E e, Node n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public Node<E> getNext() {
            return next;
        }

    }

}
