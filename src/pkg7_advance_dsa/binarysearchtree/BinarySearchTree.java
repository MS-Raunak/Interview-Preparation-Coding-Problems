package pkg7_advance_dsa.binarysearchtree;

public class BinarySearchTree {
    static int index=-1;

    public Node buildTree(Node root, int data){
        if (root==null)
            root = new Node(data);
        else if (data < root.data)
            root.left = buildTree(root.left, data);
        else
            root.right = buildTree(root.right, data);

        return root;
    }

    //Pre-Order
    public void preORder(Node root){
        if (root==null) return;

        System.out.print(root.data + " ");
        preORder(root.left);
        preORder(root.right);
    }

    //Post-Order
    public void postOrder(Node root){
        if (root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //In bst node's data displayed with in-Order always will be sorted
    public void inOrder(Node root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //height of binary search tree
    public int heightOfTree(Node root){
        if (root==null) return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return (Math.max(leftHeight, rightHeight)) + 1;
    }

    //Count of all nodes
    public int countNodes(Node root){
        if (root==null) return 0;

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return (leftCount+rightCount) + 1;
    }

    //Sum of all nodes
    public int sumOfNodes(Node root){
        if (root==null) return 0;

        int sumOfLeftNode = sumOfNodes(root.left);
        int sumOfRightNode = sumOfNodes(root.right);

        return (sumOfLeftNode + sumOfRightNode) + root.data;
    }

    //print all leaf nodes
    public void leafNodes(Node root){
        if (root==null) return;

        if (root.left==null && root.right==null) //if both root & lift is null, it means currentNode is leafNode
            System.out.print(root.data + " ");

        leafNodes(root.left);
        leafNodes(root.right);
    }

    //Search given key in tree
    public boolean searchKey(Node root, int key){
        if (root==null) return false;

        if (root.data == key) return true;
        if (key < root.data)
            return searchKey(root.left, key);
        else
            return searchKey(root.right, key);
    }

    //delete node
    public Node deleteNode(Node root, int key){
        if (root==null) return null;

        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        else { //root.data == key
            //case 1: when given key(Node) is leaf node
            if (root.left==null && root.right==null)
                return null;

            //case 2: when given key(Node) has only one child node
            if (root.left==null)
                return root.right;

            else if (root.right==null)
                return root.left;

            //case 3: when given key(Node) have both left and right children
            Node iSuccessor = inOrderSuccesser(root.right);
            root.data = iSuccessor.data;
            root.right = deleteNode(root.right, iSuccessor.data);
        }

        return root;
    }

    //helper method to delete node which have two child
    private Node inOrderSuccesser(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }

    //find keys b/w range
    public void printInRange(Node root, int X, int Y){
        if (root==null) return;

        if (root.data >=X && root.data<=Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        else if (root.data > X)
            printInRange(root.left, X, Y);
        else
            printInRange(root.right, X, Y);

    }
}
