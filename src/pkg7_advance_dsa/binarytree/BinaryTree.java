package pkg7_advance_dsa.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static int index=-1; //index is not pointing to any element in nodes array

    public Node buildTree(int[]nodes){
        index++; //index pointing to the element

        if(nodes[index]==-1)
            return null;

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    //Pre-Order Traversal: it will first print the root data and then traverse on left and right node
    public void preOrder(Node root){
        if (root==null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

        //T.Complexity O(n) bkg traversal is occurring only once on each node

    }

    //In-Order Traversal: first traverse in left side and then print root data on every leaf node and then again traverse in right side
    public void inOrder(Node root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

        //T.Complexity O(n) bkg traversal is occurring only once on each node
    }

    //Post-Order Traversal: first traverse in left side and then right side and then print root data
    public void postOrder(Node root){
        if (root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
        //T.Complexity O(n) bkg traversal is occurring only once on each node
    }

    //Level-Order: print data on same level
    public void levelOrder(Node root){
        if (root==null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); //null for adding newLine

        while (!queue.isEmpty()){
            Node curr = queue.remove();
            if (curr==null) {
                System.out.println();
                if (queue.isEmpty())
                    break;
                else
                    queue.add(null);
            }
            else {
                System.out.print(curr.data + " ");
                if (curr.left !=null )
                    queue.add(curr.left);
                if (curr.right !=null )
                    queue.add(curr.right);
            }
        }
    }

    //print each leaf node : the node which have null in both right and left side
    public void leafNode(Node root){
        if (root==null) return;

        if (root.left==null && root.right==null)
            System.out.print(root.data + " ");

        leafNode(root.left);
        leafNode(root.right);
    }

    //height of tree
    public int heightOfTree(Node root){
        if (root==null) return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1; //max height b/w left node and right node + root height
    }

    //count node
    public int countNode(Node root){
        if (root==null) return 0;

        int countLeftNode = countNode(root.left);
        int countRightNode = countNode(root.right);

        return (countLeftNode + countRightNode)+1; //all lef node + all righ node + root node
    }

    //Sum of all nodes of tree
    public int sumOfNodes(Node root){
        if (root==null) return 0;

        int sumOfLeftNode = sumOfNodes(root.left);
        int sumOfRightNode = sumOfNodes(root.right);

        return (sumOfLeftNode+sumOfRightNode) + root.data;// left node + right node + root node
    }

}
