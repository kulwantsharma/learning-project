package tree;

import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1
public class PrintSpiralFormBinaryTree
{
  public static void main(String[] args)
  {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    root.left.left = new Node(7);
    root.left.right = new Node(6);

    root.right.left = new Node(5);
    root.right.right = new Node(4);

    printSpiralForm(root);
  }

  private static void printSpiralForm(Node root)
  {
    Stack<Node> s1 = new Stack<>();
    Stack<Node> s2 = new Stack<>();

    s1.push(root);

    while (!s1.isEmpty() || !s2.isEmpty())
    {

      while (!s1.isEmpty())
      {
        Node node = s1.pop();
        System.out.print(node.data + " ");
        if (node.right != null)
        {
          s2.push(node.right);
        }
        if (node.left != null)
        {
          s2.push(node.left);
        }
      }

      while (!s2.isEmpty())
      {
        Node node = s2.pop();
        System.out.print(node.data + " ");
        if (node.left != null)
        {
          s1.push(node.left);
        }
        if (node.right != null)
        {
          s1.push(node.right);
        }
      }

    }
  }
}
