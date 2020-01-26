package com.sparta.engineering50.thanu.java;
import java.util.ArrayList;
public class SortSortBinaryTree implements SortBinaryTreeInterface {
    public SortSortBinaryTree(int[] listarray) {
        addNodes(listarray);
    }
    private Node rootNode;
    @Override
    public Node getTop() {
        return rootNode;
    }
    @Override
    public int getList() {
        return Node.getCounting();
    }
    @Override
    public void addNode(int setVal) {
        if (Node.getChildlessNode(rootNode, setVal).getSetting() >= setVal) {
            Node.getChildlessNode(rootNode, setVal).setChildLeft(setVal);
        } else if (Node.getChildlessNode(rootNode, setVal).getSetting() < setVal) {
            Node.getChildlessNode(rootNode, setVal).setChildRight(setVal);
        }
    }
    @Override
    public void addNodes(int[] setVal) {
        for (int i = 0; i < setVal.length; i++) {
            if (Node.getCounting() == 0) {
                this.rootNode = new Node(null, setVal[0]);
            } else {
                addNode(setVal[i]);
            }
        }
    }
    @Override
    public boolean findNode(int value) {
        Node node = rootNode;
        while (true) {
            if (node == null) {
                return false;
            } else if (node.getSetting() == value) {
                return true;
            } else {
                if (node.getSetting() >= value) {
                    node = node.getChildLeft();
                } else if (node.getSetting() <= value) {
                    node = node.getChildRight();
                }
            }
        }
    }
    @Override
    public Node getLeftChild(Node node) {
        return node.getChildLeft();
    }
    @Override
    public Node getRightChild(Node node) {
        return node.getChildRight();
    }
    private ArrayList<Integer> sortedArray = new ArrayList<>();
    @Override
    public void createArrayInOrder(Node node) {
        if (node != null) {
            createArrayInOrder(node.getChildLeft());
            sortedArray.add(node.getSetting());
            createArrayInOrder(node.getChildRight());
        }
    }
    @Override
    public int[] getSortedTree() {
        sortedArray.clear();
        createArrayInOrder(rootNode);
        int[] ascArray = new int[sortedArray.size()];
        for (int i = 0; i < sortedArray.size(); i++) {
            ascArray[i] = sortedArray.get(i);
        }
        return ascArray;
    }
}
