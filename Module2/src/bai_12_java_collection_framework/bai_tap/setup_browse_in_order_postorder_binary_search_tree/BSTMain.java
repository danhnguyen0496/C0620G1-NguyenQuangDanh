package bai_12_java_collection_framework.bai_tap.setup_browse_in_order_postorder_binary_search_tree;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.preOder();
        System.out.println("----------------");
        tree.delete(70);
        tree.delete(40);
        tree.preOder();
        System.out.println("----------------");
        System.out.println(tree.search(80));
//        tree.preOder();

    }
}
