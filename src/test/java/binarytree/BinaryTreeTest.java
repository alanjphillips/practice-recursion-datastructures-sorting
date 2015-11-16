package binarytree;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class BinaryTreeTest {

    @Test
    public void shouldCreateBinaryTree() {
        BinaryTree<String> binaryTree = new BinaryTree<>();
        BinaryTree.Node<String> root = binaryTree.addRoot("ROOT");

        BinaryTree.Node<String> rootLeft1 = binaryTree.addLeftChild(root, "LEFT1");
        BinaryTree.Node<String> rootRight1 = binaryTree.addRightChild(root, "RIGHT1");

        BinaryTree.Node<String> rootLeft1Left1 = binaryTree.addLeftChild(rootLeft1, "LEFT1LEFT1");
        BinaryTree.Node<String> rootLeft1Right1 = binaryTree.addRightChild(rootLeft1, "LEFT1RIGHT1");

        System.out.println("Preorder: " + binaryTree.listPreorder(root, new LinkedList<>()));
        System.out.println("Postorder: " + binaryTree.listPostorder(root, new LinkedList<>()));
        System.out.println("Breadth First: " + binaryTree.listBreadthFirst(root, new LinkedList<>()));
        System.out.println("Inorder: " + binaryTree.listInorder(root, new LinkedList<>()));

        assertEquals(5, binaryTree.getSize());

        binaryTree.remove(rootLeft1Left1);

        System.out.println("\n\nPreorder: " + binaryTree.listPreorder(root, new LinkedList<>()));

        assertEquals(4, binaryTree.getSize());

        binaryTree.remove(rootLeft1);

        System.out.println("Preorder: " + binaryTree.listPreorder(root, new LinkedList<>()));

        assertEquals(3, binaryTree.getSize());
    }

}