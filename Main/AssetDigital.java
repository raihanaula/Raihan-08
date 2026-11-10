public abstract class AssetDigital {
    protected String id;
    protected String namaFile;
    protected double ukuranMB;

    public AssetDigital(String id, String namaFile, double ukuranMB) {
        this.id = id;
        this.namaFile = namaFile;
        this.ukuranMB = ukuranMB;
    }

    public abstract void tampilkanPreview();

    public String getInfo() {
        return "ID: " + id +
               ", Nama File: " + namaFile +
               ", Ukuran: " + ukuranMB + " MB";
    }
}