package bai_12_java_collection_framework.bai_tap.setup_browse_in_order_postorder_binary_search_tree;

public class BinarySearchTree {
    protected TreeNode root;
    protected int size = 0;

    public BinarySearchTree() {
        root =null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    // duyệt postoder
    public void postOder(TreeNode root) {
        if (root == null) return;
        postOder(root.left);
        postOder(root.right);
        System.out.println(root.element + " ");
    }

    public void postOder() {
        postOder(root);
    }

    // duyệt preoder
    public void preOder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preOder(root.left);
        preOder(root.right);
    }

    public void preOder() {
        postOder(root);
    }

    // xóa
    public void delete(int value) {
        deleteNode(root, value);
    }

    public TreeNode deleteNode(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.element) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.element) {
            root.right = deleteNode(root.right, value);
        } else {
            this.size--;
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.element = maxValue(root.left);
            root.left = deleteNode(root.left, root.element);
        }
        return root;
    }

    public int maxValue(TreeNode root) {
        int max = root.element;
        while (root.right != null) {
            max = root.right.element;
            root = root.right;
        }
        return max;
    }

    // tìm kiếm
    public boolean search(int value) {
        return value == search(root, value).element;
    }

    public TreeNode search(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (value > root.element) {
            return search(root.right, value);
        } else if (value < root.element) {
            return search(root.left, value);
        }
        return root;
    }

    // chèn
    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        if (value > root.element) {
            root.right = insert(root.right, value);
        } else if (value < root.element) {
            root.left = insert(root.left, value);
        }
        return root;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.element +
                ", size=" + size +
                '}';
    }
}