package com.ss.algorithms.tree;

public class Node {

    String ticker;
    String companyName;
    double targetPrice;
    double currentPrice;
    Node leftNode;
    Node rightNode;
    Node parentNode;

    public Node(String ticker, String companyName , double targetPrice , double currentPrice )
    {
        this.ticker=ticker;
        this.companyName= companyName;
        this.targetPrice=targetPrice;
        this.currentPrice=currentPrice;
        this.leftNode=null;
        this.rightNode=null;
        this.parentNode=null;
    }



    public void printNode()
    {

        if ( parentNode != null ) {
            System.out.println("Node is " + ticker
                    + " , " + companyName
                    + " , " + targetPrice
                    + " , " + currentPrice
                    + " , " + leftNode
                    + " , " + rightNode
                    + " , " + parentNode.ticker
            );
        }
        else
        {
            System.out.println("Root Node is " + ticker
                    + " , " + companyName
                    + " , " + targetPrice
                    + " , " + currentPrice
                    + " , " + leftNode
                    + " , " + rightNode
                    + " , " + parentNode
            );
        }


    }
}



