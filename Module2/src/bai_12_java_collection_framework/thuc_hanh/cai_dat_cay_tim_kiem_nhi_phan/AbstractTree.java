package bai_12_java_collection_framework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan;

public class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public void inorder() {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
