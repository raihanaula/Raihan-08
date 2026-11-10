public class VideoPromosi extends Video
        implements DapatDipromosikan {

    public VideoPromosi(String id, String namaFile,
                        double ukuranMB, int durasi) {
        super(id, namaFile, ukuranMB, durasi);
    }

    @Override
    public void promosikan() {
        System.out.println("Video " + namaFile +
                           " berhasil dipromosikan!");
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("Preview Video Promosi: " + namaFile);
        System.out.println("Durasi: " + durasi + " detik");
        System.out.println(getInfo());
    }
}