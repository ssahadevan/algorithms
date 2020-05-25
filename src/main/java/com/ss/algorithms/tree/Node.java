package com.ss.algorithms.tree;

public class Node {

    String ticker;
    String companyName;
    double targetPrice;
    double currentPrice;
    Node leftNode;
    Node rightNode;

    public Node(String ticker, String companyName , double targetPrice , double currentPrice , Node leftNode, Node rightNode)
    {
        this.ticker=ticker;
        this.companyName= companyName;
        this.targetPrice=targetPrice;
        this.currentPrice=currentPrice;
        this.leftNode=leftNode;
        this.rightNode=rightNode;
    }

    public void printNode()
    {
        System.out.println( "Node is " + ticker
                            + " , " + companyName
                            + " , " + targetPrice
                            + " , " + currentPrice
                            + " , " + leftNode
                            + " , " + rightNode
        );
    }
}



