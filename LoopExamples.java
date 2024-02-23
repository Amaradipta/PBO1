public class LoopExamples {
    public static void main(String[] args) {
        A();
        System.out.println();
        B();
        System.out.println();
        C();
        System.out.println();
        D();
        System.out.println();
        E();
    }
    // A: 0, 2, 4, 6, 8
    private static void A() {
        for (int i = 0; i <= 8; i += 2) {
            System.out.print(i + " ");
        }
    }
    // B: 1, 3, 5, 7, 9
    private static void B() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }
    }
    // C: 1, 2, 4, 7, 11, 16, 22
    private static void C() {
        int sum = 1;
        for (int i = 1; i <= 6; i++) {
            System.out.print(sum + " ");
            sum += i;
        }
    }
    // D: -3, -1, 2, 6, 11, 17, 24
    private static void D() {
        int num = -3;
        for (int i = 0; i <= 6; i++) {
            System.out.print(num + " ");
            num += i;
        }
    }
    // E: 1 1 2 3 5 8 13 21
    private static void E() {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 8; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}