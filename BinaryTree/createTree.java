package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrderTraverse(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    if (q.isEmpty()) {
                        System.out.println("");
                        return;
                    } else {
                        System.out.println("");

                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");

                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }

        }

    }

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;

        }

    }

    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int finalDiam = Math.max(leftInfo.diam, Math.max(rightInfo.diam, leftInfo.ht + rightInfo.ht + 1));
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(finalDiam, height);

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;

        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    public static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        if (!isIdentical(node.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subroot.right)) {
            return false;
        }

        return true;

    }

    public static boolean isSubTree(Node root, Node subroot) {

        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        return isIdentical(root.left, subroot) || isIdentical(root.right, subroot);
    }

    static class Info2 {
        Node node;
        int hd;

        Info2(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }

    }

    public static void topView(Node root) {
        if (root == null)
            return;

        Queue<Info2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info2(root, 0));

        while (!q.isEmpty()) {
            Info2 curr = q.remove();

            // store first node of each horizontal distance
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info2(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd + 1);
            }

            if (curr.node.right != null) {
                q.add(new Info2(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        System.out.println("TOP VIEW IS:");
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree b1 = new BinaryTree();
        Node root = b1.createTree(nodes);
        System.out.println(root.data);

        b1.preorder(root);
        System.out.println(" ");
        b1.inorder(root);
        System.out.println(" ");
        b1.postorder(root);
        System.out.println("");
        b1.levelOrderTraverse(root);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);
        topView(root2);
        System.out.println(height(root2));
        System.out.println(countNodes(root2));

        System.out.println(sumOfNodes(root2));
        System.out.println("Diameter of the tree is: " + diameter(root2));
        Info result = diameter2(root2);
        System.out.println("Diameter of the tree is: " + result.diam);

        Node subNode = new Node(2);
        subNode.left = new Node(4);
        subNode.right = new Node(5);

        System.out.println(isSubTree(root, subNode));

    }
}
