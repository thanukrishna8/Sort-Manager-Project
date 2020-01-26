package com.sparta.engineering50.thanu.java;

public interface SortBinaryTreeInterface {
    Node getTop();
    int getList();
    void addNode(int value);
    void addNodes(int[] values);
    boolean findNode(int value);
    Node getLeftChild(Node node);
    Node getRightChild(Node node);
    void createArrayInOrder(Node node);
    int[] getSortedTree();
}