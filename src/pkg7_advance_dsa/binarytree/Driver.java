package pkg7_advance_dsa.binarytree;

public class Driver {
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; //-1 indicating null
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //tree.preOrder(root);
        //tree.inOrder(root);
        //tree.postOrder(root);
        //tree.levelOrder(root);

        tree.leafNode(root);

        System.out.println(tree.heightOfTree(root));
        System.out.println(tree.countNode(root));
        System.out.println(tree.sumOfNodes(root));

    }
}

