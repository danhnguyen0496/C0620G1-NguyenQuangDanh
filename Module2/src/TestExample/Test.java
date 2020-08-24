package TestExample;

public class Test {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 10 - (10 - i); j < 10; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = i + 1; j < 10; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

