package com.bridgelabz;

public class MyTreeNode<T> {
	T key;
    MyTreeNode<T> left;
    MyTreeNode<T> right;

    public MyTreeNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

}	   