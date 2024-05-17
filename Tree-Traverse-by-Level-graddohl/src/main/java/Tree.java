/////////////////////////////////////////////////
//
// Garrett Raddohl / 400C 001
//
//////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

  public Tree() {
    root = null;
  }

  public Tree(int val) {
    root = new Node(val);
  }

  /*
   * Class Node. 
   *
   * This is the main iterface you will be using. The 
   * this tree handlkes n-ary children! So, do not just 
   * assume it is a binary tree (only 2 children). 
   * 
   * The children are stored in an arrary list. So, when
   * you do your traversal by level, you have the children
   * nodes in the array list (in the proper order from left
   * to right).
   */
  
  static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
    Node parent = null;

    public Node(int d) {
      data = d;
    }

    public Node addChild(int d) {
      Node n = new Node(d);
      n.setParent(this);
      children.add(n);
      return n;
    }

    // This method returns an array of a node's children
    public ArrayList<Node> getChildren() {
      return children;
    }

    public void setParent(Node p) {
      parent = p;
    }

    public Node getParent() {
      return parent;
    }
  }

  Node root = null;
  
  /**
   *  Method traverseByLevel
   *
   * The method will return a String of the tree's
   * data values using a breadth first traversal. In 
   * otherword, it prints the node value level by level
   * starting at the root node and working down one
   * level at a time printing the values from left to right. 
   *
   * Returns 
   * A string with the tree's data values separated by spaces.
   * If tree is empty, return an empty string.
   */

  public String traverseByLevel() {
      String result = "";
      Queue<Node> q = new LinkedList<>();
    
      if (root == null) {
        return result;
      }
    
      q.add(root);
      while (!q.isEmpty()){
          Node n = q.remove();
          result += n.data + " ";
          for (Node child : n.getChildren()){
              q.add(child);
          }
        
      }
    
      // Return the result after trimming any trailing spaces
      return result.trim();
  }
}
