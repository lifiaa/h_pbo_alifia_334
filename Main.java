import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buah1 dan buah2
        Buah buah1 = new Buah("Lemon", "Kuning", "C");
        Buah buah2 = new Buah("Mangga", "Hijau", "A, C dan E");

        // Memanggil metode tampilkanInfo() untuk kedua buah
        buah1.tampilkanInfo();
        buah2.tampilkanInfo();
    }
}

public class Buah {
    String nama;
    String warna;
    String vitamin;

    // Konstruktor
    Buah(String nama, String warna, String vitamin) {
        this.nama = nama;
        this.warna = warna;
        this.vitamin = vitamin;
    }

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Vitamin: " + vitamin);
        System.out.println();
    }
}
