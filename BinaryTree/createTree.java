package BinaryTree;

public class createTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {
        static int idx = -1;

        public static Node createTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = createTree(nodes);
            newNode.right = createTree(nodes);
            return newNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 4, 5, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree b1 = new BinaryTree();
        Node root = b1.createTree(nodes);
        System.out.println(root.data);

        b1.preorder(root);

    }
}
