import java.util.Scanner;

class AvltreeDemo {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        AVL avl = new AVL();
       
        int totalNode;

        System.out.println("How many nodes you want to enter");
        totalNode = scr.nextInt();

        for (int i = 1; i <= totalNode; i++) {
            System.out.println("Enter data : ");
            int data = scr.nextInt();
            avl.root = avl.addNode(avl.root, data);
        }

       
        avl.inOrder(avl.root);
     scr.close();
    }
   
}

class AVL {

    Node root = null;

    Node addNode(Node root, int data) {
        if (root == null) {
            root = new Node();
            root.data = data;
            root.left = null;
            root.right = null;
            root.height = 1;
            return root;
        } else {

            if (data > root.data) {

                root.right = addNode(root.right, data);
            } else {
                root.left = addNode(root.left, data);
            }

           
            int leftHeight = 0;
            int rightHeight = 0;

            if (root.left != null) {
                leftHeight = root.left.height;
            }

            if (root.right != null) {
                rightHeight = root.right.height;
            }

            if (leftHeight > rightHeight) {
                root.height = leftHeight + 1;
            } else {
                root.height = rightHeight + 1;
            }
           

            int balanceFactor = leftHeight - rightHeight;

            if (balanceFactor < -1) {
                
                if(data > root.right.data){
                    System.out.println("Right Right Imbalance => " + root.data + "(" + balanceFactor + ")");
                }else{
                    System.out.println("Right Left Imbalance => " + root.data + "(" + balanceFactor + ")");
                }
            } else if (balanceFactor > 1) {
                if(data < root.left.data){
                    System.out.println("Left Left Imbalance => " + root.data + "(" + balanceFactor + ")");
                }else{
                    System.out.println("Left Right Imbalance => " + root.data + "(" + balanceFactor + ")");
                }
            }

            return root;
        }
    }

    void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + "(" + root.height + ")"); 
            inOrder(root.right);
        }
    }
}

//node 
class Node {

    int data;
    Node left;
    Node right;
    int height;
}