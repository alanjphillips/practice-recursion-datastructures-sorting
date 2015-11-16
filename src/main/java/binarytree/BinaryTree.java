package binarytree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<E> {

    private Node<E> root = null;

    private int size = 0;

    public Node<E> addRoot(E e) {
        if (root != null) {
            throw new IllegalStateException("Root already exists");
        }
        root = new Node<>(e);
        size++;
        return root;
    }

    public Node<E> addLeftChild(Node<E> p, E elementOfChild) {
        if (p.getLeftChild() != null) {
            throw new IllegalStateException("Left Child already exists");
        }
        p.setLeftChild(new Node<E>(elementOfChild));
        p.getLeftChild().setParent(p);
        size++;
        return p.getLeftChild();
    }

    public Node<E> addRightChild(Node<E> p, E elementOfChild) {
        if (p.getRightChild() != null) {
            throw new IllegalStateException("Right Child already exists");
        }
        p.setRightChild(new Node<E>(elementOfChild));
        p.getRightChild().setParent(p);
        size++;
        return p.getRightChild();
    }

    public E setElement(Node<E> n, E e) {
        E prevElement = n.getElement();
        n.setElement(e);
        return prevElement;
    }

    public Node<E> remove(Node<E> n) {
        if (n.getLeftChild() != null && n.getRightChild() != null) {
            throw new IllegalStateException("Cannot remove Node that has 2 Children");
        }

        // which child will replace removed Node? or Null
        Node<E> replacementNode = n.getLeftChild() != null ? n.getLeftChild() : n.getRightChild();

        Node<E> parent = n.getParent();
        if(parent.getLeftChild() == n) {
            parent.setLeftChild(replacementNode);
        } else {
            parent.setRightChild(replacementNode);
        }

        if (replacementNode != null) {
            replacementNode.setParent(parent);
        }
        size--;

        return replacementNode;
    }

    public int getSize() {
        return size;
    }

    public List<E> listPreorder(Node<E> n, List<E> acc) {
        if (n == null) {
            return acc;
        }

        acc.add(n.getElement());

        listPreorder(n.getLeftChild(), acc);
        listPreorder(n.getRightChild(), acc);
        return acc;
    }

    public List<E> listPostorder(Node<E> n, List<E> acc) {
        if (n == null) {
            return acc;
        }

        listPostorder(n.getLeftChild(), acc);
        listPostorder(n.getRightChild(), acc);

        acc.add(n.getElement());
        return acc;
    }

    public List<E> listInorder(Node<E> n, List<E> acc) {
        if (n == null) {
            return acc;
        }
        if (n.getLeftChild() != null) {
            listInorder(n.getLeftChild(), acc);
        }

        acc.add(n.getElement());

        if (n.getRightChild() != null) {
            listInorder(n.getRightChild(), acc);
        }
        return acc;
    }

    public List<E> listBreadthFirst(Node<E> root, List<E> acc) {
        LinkedList<Node<E>> queue = new LinkedList<>();
        queue.addLast(root);

        while (queue.size() > 0) {
            Node<E> n = queue.removeFirst();
            if (n != null) {
                acc.add(n.getElement());

                queue.addLast(n.getLeftChild());
                queue.addLast(n.getRightChild());
            }
        }
        return acc;
    }


    static class Node<E> {

        private Node<E> parent;
        private Node<E> leftChild;
        private Node<E> rightChild;

        private E element;

        Node(E e) {
            element = e;
        }

        Node(E e, Node<E> p, Node<E> l, Node<E> r){
            element = e;
            parent = p;
            leftChild = l;
            rightChild = r;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<E> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<E> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<E> rightChild) {
            this.rightChild = rightChild;
        }

        public Node<E> getSibling() {
            if (parent == null) {
                return null;
            }

            if (this == parent.getLeftChild()) {
                return parent.getRightChild();
            } else {
                return parent.getLeftChild();
            }
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

    }

}
