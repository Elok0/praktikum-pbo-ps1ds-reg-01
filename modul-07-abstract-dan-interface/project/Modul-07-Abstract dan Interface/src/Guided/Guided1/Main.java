package Guided.Guided1;

public class Main {
    public static void main(String[] args) {
        // Polimorfisme: referensi abstract class Employee, objek SalariedEmployee
        SalariedEmployee salaried = new SalariedEmployee("Elysia Reksy", 5000000.00);

        System.out.println("Nama: " + salaried.getName());
        System.out.println("Gaji: Rp " + salaried.earnings());
    }
}
