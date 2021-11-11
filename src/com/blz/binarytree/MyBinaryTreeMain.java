package com.blz.binarytree;

public class MyBinaryTreeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree program");
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);


        myBinaryTree.printBinaryTree();

    }
}
