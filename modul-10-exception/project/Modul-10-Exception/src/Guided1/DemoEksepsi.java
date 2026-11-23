package Guided1;

class DemoEksepsi {
    public static void main(String[] args) {
        try {
            int[] arr = new int[1];
            System.out.println(arr[0]);
            System.out.println("Berhasil mengakses elemen array");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi karena indeks di luar kapasitas array");
        }
        System.out.println("Sesudah blok try catch");
    }
}
