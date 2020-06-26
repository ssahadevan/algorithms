package com.ss.algorithms.tree;

public class Node {

    String ticker;
    String companyName;
    double targetPrice;
    double currentPrice;
    Node leftNode;
    Node rightNode;
    Node parentNode;
    boolean isLeftNode;
    boolean isRightNode;
    int depthOfNodeFromRoot;

    public Node(String ticker, String companyName , double targetPrice , double currentPrice )
    {
        this.ticker=ticker;
        this.companyName= companyName;
        this.targetPrice=targetPrice;
        this.currentPrice=currentPrice;
        this.leftNode=null;
        this.rightNode=null;
        this.parentNode=null;
        isRightNode=false;
        isLeftNode=false;
        depthOfNodeFromRoot=0;
    }



    public void printNodeDetails()
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

    public void printNode()
    {

        if ( parentNode != null )
        {
            if ( isLeftNode )
            {
                System.out.println("Left  Node: "
                     //   + "   " + "  =|=  "
                        + ticker
                    //    + "  =|=  "
                        + " , parentNode is " + parentNode.ticker
                        + " , depthOfNodeFromRoot= " + depthOfNodeFromRoot
                );
            }
            else
            {
                System.out.println("Right Node: "
                      //      + "          " + "  =|= "
                            + ticker
                      //      + "  =|=  "
                            + " , parentNode is " + parentNode.ticker
                            + " , depthOfNodeFromRoot= " + depthOfNodeFromRoot
                );
            }
        }
        else
        {
            System.out.println("Root Node:"
                    + " "
                    + ticker);
        }


    }
}



