package com.sparta.engineering50.thanu.java;
public class Node {
    private Node childLeft;
    private Node childRight;
    private Node parent;
    private int setting;
    private static int counting;
    public static int getCounting() {
        return counting;
    }
    public Node getChildLeft() {
        return childLeft;
    }
    public void setChildLeft(int setting) {
        this.childLeft = new Node(this , setting);
    }
    public Node getChildRight() {
        return childRight;
    }
    public void setChildRight(int setting) {
        this.childRight = new Node(this, setting);
    }

    public static Node getChildlessNode(Node elementnode, int setval) {
        if (elementnode.getChildLeft() == null && elementnode.getSetting() >= setval) {
            return elementnode;
        } else if (elementnode.getChildRight() == null && elementnode.getSetting() < setval) {
            return elementnode;
        } else if (elementnode.getSetting() >= setval) {
            elementnode = Node.getChildlessNode(elementnode.getChildLeft(), setval);
        } else if (elementnode.getSetting() < setval) {
            elementnode = Node.getChildlessNode(elementnode.getChildRight(), setval);
        }
        return elementnode;
    }
    public Node getParent() {
        return parent;
    }
    public int getSetting() {
        return setting;
    }
    public Node(Node parent, int setting){
        this.parent = parent;
        this.setting = setting;
        counting++;
    }
}
