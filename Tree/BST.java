public class BST {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();// root==> null

        bst.root = bst.addNode(bst.root, 20);// 30

        bst.addNode(bst.root, 5);// 30
        bst.addNode(bst.root, 1);// 30

        bst.addNode(bst.root, 15);// 30

        bst.addNode(bst.root, 9);// 30

        bst.addNode(bst.root, 12);// 30

        bst.addNode(bst.root, 30);// 30

        bst.addNode(bst.root, 25);// 30

        bst.addNode(bst.root, 40);// 30

        
        System.out.println(bst.search(bst.root, 12));
        System.out.println("\ndelete 12\n");
        bst.deleteNode(bst.root, 12);
        bst.inOrder(bst.root);// asc

    }
}

class BinarySearchTree {

    Node root;

    Node addNode(Node localRoot, int data) {// null,90
        if (localRoot == null) { //
            localRoot = new Node();
            localRoot.data = data;
            localRoot.left = null;
            localRoot.right = null;
            return localRoot;
        } else {
            if (data > localRoot.data) {// 90 > 60
                localRoot.right = addNode(localRoot.right, data);// null,90
            } else {
                localRoot.left = addNode(localRoot.left, data);
            }
        }
        return localRoot;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);

        }
    }

    boolean search(Node root, int key) {
        if (root != null) {
            if (root.data == key) {
                return true;
            } else if (key > root.data) {
                return search(root.right, key);
            } else {
                return search(root.left, key);
            }
        }
        return false;
    }

    Node deleteNode(Node root, int key) {
        if (root != null) {
            if (root.data == key) {
                if (root.left == null && root.right == null) {
                    return null;
                } else if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {

                }

            } else if (key > root.data) {
                root.right = deleteNode(root.right, key);
            } else {
                root.left = deleteNode(root.left, key);
            }
            return root;
        }
        return null;
    }
}

class Node {

    int data;
    Node left;
    Node right;
}