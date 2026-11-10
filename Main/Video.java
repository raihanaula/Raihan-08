public class Video extends AssetDigital {
    protected int durasi;

    public Video(String id, String namaFile,
                 double ukuranMB, int durasi) {
        super(id, namaFile, ukuranMB);
        this.durasi = durasi;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("Preview Video: " + namaFile);
        System.out.println("Durasi: " + durasi + " detik");
        System.out.println(getInfo());
    }
}