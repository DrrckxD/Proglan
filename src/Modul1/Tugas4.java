package Modul1;

public class Tugas4 {

    public static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Min value (Scenario 1): " + findMin(1, 2, 3));
        System.out.println("Min value (Scenario 2): " + findMin(-1, -2, -3));
        System.out.println("Min value (Scenario 3): " + findMin(0, 0, 1));
    }
}



