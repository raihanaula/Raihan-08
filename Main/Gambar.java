public class Gambar extends AssetDigital {
    private String resolusi;

    public Gambar(String id, String namaFile,
                  double ukuranMB, String resolusi) {
        super(id, namaFile, ukuranMB);
        this.resolusi = resolusi;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("Preview Gambar: " + namaFile);
        System.out.println("Resolusi: " + resolusi);
        System.out.println(getInfo());
    }
}