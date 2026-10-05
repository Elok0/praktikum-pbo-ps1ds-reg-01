public class TestPass {

    // 1. Atribut
    int i, j;

    // 2. Konstruktor
    TestPass(int a, int b) {
        i = a;
        j = b;
    }

    // 3. Method Pass by Value (primitif)
    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    // 4. Method Pass by Reference (objek)
    void calculate(TestPass e) {
        e.i = e.i * 10;
        e.j = e.j / 2;
    }

    // 5. Entry point untuk menjalankan program
    public static void main(String[] args) {
        int x, y;
        TestPass z;
        z = new TestPass(50, 100);
        x = 10;
        y = 20;

        System.out.println("Nilai sebelum passed by value : ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // passed by value
        z.calculate(x, y);
        System.out.println("Nilai sesudah passed by value : ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Nilai sebelum passed by reference : ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);

        // passed by reference
        z.calculate(z);
        System.out.println("Nilai sesudah passed by reference : ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);
    }
}