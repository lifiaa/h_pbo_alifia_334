class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + (ipk >= 2.75 ? "Lulus" : "Tidak Lulus"));
    }
}

public class manajemenDataMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("202410370110334", "Alifia Nadia", "Informatika", 3.5);
        mhs1.tampilkanInfo();
    }
}
