package bai_2_vong_lap_trong_java.bai_tap;

public class DisplayPrimeLess100 {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100 là: ");
        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }
    public static boolean isPrime(int n) {
        boolean check = true;
        if (n < 2) {
            return false;
        } else if (n >= 2) {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
