// Kelas Utama untuk menjalankan program
public class Main
    public static void main(String[] args) {
        // ERROR: Mencoba membuat objek langsung dari abstract class 'Anggota'
        Anggota a = new Anggota("A001", "Budi");
        
        a.tampilkanInfo();
    }
}