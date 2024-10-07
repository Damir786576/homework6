public class Main {
    public static void main(String[] args) {
        // 1 задача
        for (byte i = 1; i < 11; i++) {
            System.out.println(i);
        }
        // 2 задача
        for (byte i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // 3 задача
        for (byte i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        // 4 задача
        for (byte i = 10; i > -11; i--) {
            System.out.println(i);
        }
        // 5 задача
        for (short i = 1904; i < 2097; i += 4) {
            System.out.println(i + " год является високосным");
        }
        // 6 задача
        for (byte i = 7; i < 100; i += 7) {
            System.out.println(i);
        }
        // 7 задача
        for (short i = 1; i < 1000; i *= 2) {
            System.out.println(i);
        }
        // 8 задача
        short summ = 29000;
        int total = 0;
        for (byte i = 0; i < 12; i++) {
            total += summ;
        }
        System.out.println(total);
        // 9 задача
        short summ1 = 29000;
        int total1 = 0;
        for (byte i = 0; i < 12; i++) {
            total1 += total1 * 0.01;
            total1 += summ1;
        }
        System.out.println(total1);
        // 10 задача
        for (byte i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}