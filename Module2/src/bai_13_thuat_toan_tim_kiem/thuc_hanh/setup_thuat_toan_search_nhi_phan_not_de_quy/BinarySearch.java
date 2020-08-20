package bai_13_thuat_toan_tim_kiem.thuc_hanh.setup_thuat_toan_search_nhi_phan_not_de_quy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }

    static int binarySearch(int[] list, int key) {
        int l = 0;
        int r = list.length - 1;
        while (l <= r) {
            int mid = (r + l) / 2;
            if (list[mid] > key) {
                r = mid - 1;
            } else if (list[mid] < key) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
