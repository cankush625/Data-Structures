package Trees;
import java.util.Scanner;

class BinarySearchTree {
    private static Scanner scanner = new Scanner(System.in);

    class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder()  {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("Enter number of nodes : ");
        int n = scanner.nextInt();

        System.out.println("Enter data : ");
        for (int i = 0 ; i < n; i++) {
            int data;
            data = scanner.nextInt();
            tree.insert(data);
        }

        tree.inorder();
    }
}
//by Ankush Chavan