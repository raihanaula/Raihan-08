import java.util.ArrayList;

public class MainAsset {
    public static void main(String[] args) {

        // ArrayList AssetDigital
        ArrayList<AssetDigital> daftarAset = new ArrayList<>();

        daftarAset.add(new Gambar("G01", "Foto.jpg", 2.5, "1920x1080"));

        daftarAset.add(new Video("V01", "Film.mp4", 50.5, 120));

        daftarAset.add(new Dokumen("D01", "Laporan.pdf", 1.5, 25));

        daftarAset.add(new VideoPromosi("VP01", "Iklan.mp4", 30.5, 60));

        // Menampilkan semua preview
        System.out.println("=== DAFTAR ASET DIGITAL ===");

        for (AssetDigital aset : daftarAset) {
            aset.tampilkanPreview();
            System.out.println("----------------------");
        }

        // Mengecek objek yang bisa dipromosikan
        System.out.println("\n=== CEK PROMOSI ===");

        for (AssetDigital aset : daftarAset) {
            if (aset instanceof DapatDipromosikan) {
                DapatDipromosikan promo =
                    (DapatDipromosikan) aset;

                promo.promosikan();
                promo.infoPromosi();
            }
        }

        // ArrayList khusus interface
        ArrayList<DapatDipromosikan> daftarPromosi =
            new ArrayList<>();

        daftarPromosi.add(
            new VideoPromosi("VP02", "Promo.mp4", 20.0, 90)
        );

        System.out.println("\n=== DAFTAR ASET PROMOSI ===");

        for (DapatDipromosikan promo : daftarPromosi) {
            promo.promosikan();
            promo.infoPromosi();
        }
    }
}