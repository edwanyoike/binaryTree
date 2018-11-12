package com.BugzTests;

public class Node {

    int iData;
    int fData;
    Node leftChild;
    Node rightChild;

    public void displayNode() // display ourself
    {
        System.out.print("{");
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(fData);
        System.out.print("} ");
    }
} // end class Node


