/*
 * Place your unit testing here. All developers shoudl 
 * adequately unit test their own code on common code path 
 * lengths and test boundary cases / edge cases. Do not 
 * just rely on the unit test below. 
 */

public class Main {
  
  public static void main(String[] args) {

    // Class Tree provided is a basic class that 
    // the insert is not implemented. so adding
    // nodes is not part of the assignment. You add
    // them as shown below
    
    Tree myTree = new Tree(1);
    Tree.Node n2 = myTree.root.addChild(2);
    Tree.Node n3 = myTree.root.addChild(3);
    n2.addChild(4);
    n2.addChild(5);
    n2.addChild(6);
    n3.addChild(7);
    n3.addChild(8);
    n3.addChild(9);

    // The above builds the following tree:
    //              1
    //            /   \  
    //           2     3
    //          / \   / \
    //         4   5 6   7
    //        / \          
    //       8   9
    //

    System.out.println("Test 1: ");
    System.out.println("    Expected order : 1 2 3 4 5 6 7 8 9");
    System.out.println("    Returned order : " 
                       + myTree.traverseByLevel());
  }

}