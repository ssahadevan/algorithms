package com.ss.algorithms.tree;


public class BinaryTree {

    private Node rootNode = null ;
    private boolean debug=true;

    public static void main(String[] args) throws Exception{

        Node intcNode= new Node("INTC", "INTEL", 61.25, 80.00);
        // System.out.println("In BinaryTree" + intcNode.ticker) ;
        // intcNode.printNode();
        Node aapl= new Node("AAPL", "APPLE", 425.50, 318.05);

        BinaryTree myBt = new BinaryTree(intcNode);
        myBt.addNode( myBt.rootNode , aapl);

        System.out.println("Calling printtree");
        myBt.printTree(myBt.rootNode);

        Node csco= new Node("CSCO", "Cisco", 55.50, 45.50);
        myBt.addNode( myBt.rootNode , csco) ;
        myBt.printTree(myBt.rootNode);

        Node nvda= new Node("NVDA", "Nvidia", 455.50, 345.50);
        myBt.addNode( myBt.rootNode , nvda) ;
        myBt.printTree(myBt.rootNode);

    }


    public BinaryTree(Node node) throws Exception
    {
         rootNode = addNode(rootNode, node);
         // rootNode.printNode();
    }

   public Node addNode(Node currentNode , Node nodeToAdd) throws Exception {
       if ( nodeToAdd == null )
          throw new Exception("*** nodeToAdd cannot be null ");

       if ( currentNode == null ) {
           // Root Node case
           currentNode = nodeToAdd;
           nodeToAdd.parentNode=null;
           nodeToAdd.depthOfNodeFromRoot=0;
       }
       else
          if ( currentNode.ticker.compareTo( nodeToAdd.ticker ) < 0 )  {
               Node addedNode = addNode(currentNode.rightNode, nodeToAdd);
               if ( currentNode.rightNode == null ) {
                   currentNode.rightNode = addedNode;
                   addedNode.parentNode=currentNode;
                   addedNode.isRightNode=true;
                   addedNode.depthOfNodeFromRoot = currentNode.depthOfNodeFromRoot + 1 ;
                   if ( debug )
                       System.out.println("INFO: Added " + addedNode.ticker + " to the right of " + currentNode.ticker);
               }
           }
           else {
               Node addedNode = addNode(currentNode.leftNode, nodeToAdd);
               if ( currentNode.leftNode == null ) {
                   currentNode.leftNode = addedNode;
                   addedNode.parentNode=currentNode;
                   addedNode.isLeftNode=true;
                   addedNode.depthOfNodeFromRoot = currentNode.depthOfNodeFromRoot + 1 ;
                   if ( debug )
                      System.out.println("INFO: Added " + addedNode.ticker + " to the left of " + currentNode.ticker);
               }
           }


       return currentNode;
   }

   public void printTree( Node currentNode )
   {

       if ( currentNode == null )
       {
           System.out.println("currentNode is Null");
           return;
       }

       currentNode.printNode();

       if ( currentNode.leftNode != null )
           printTree( currentNode.leftNode ) ;

       if ( currentNode.rightNode != null )
           printTree(currentNode.rightNode);
   }

}
