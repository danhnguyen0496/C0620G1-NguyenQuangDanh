package bai_12_java_collection_framework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.println("\nThe number of nodes is: " + tree.getSize());
    }
}
