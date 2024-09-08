package pkg7_advance_dsa.binarysearchtree;

public class Driver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[]nodes = {5,1,3,4,2,7};
        Node root=null;


        for (int node : nodes){
            root = bst.buildTree(root, node);
        }

        //bst.preORder(root);
        //bst.postOrder(root);
        bst.inOrder(root);

        //System.out.println("\nHeight of tree: " + bst.heightOfTree(root));
        //System.out.println("Count of nodes: " + bst.countNodes(root));
        //System.out.println("Sum of nodes: " + bst.sumOfNodes(root));

        //bst.leafNodes(root); //2,4,7

        //System.out.println("\n" + bst.searchKey(root,1));
        //System.out.println(bst.searchKey(root,10));

        //bst.deleteNode(root, 3);
        //System.out.println();
        //bst.inOrder(root);

        System.out.println();
        bst.printInRange(root, 5, 7);


    }
}
