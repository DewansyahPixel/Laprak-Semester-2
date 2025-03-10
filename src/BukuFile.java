import java.util.List;

class BukuFile {
    public enum Kategori {
        TEKNOLOGI, FILSAFAT, SEJARAH, AGAMA, PSIKOLOGI, POLITIK, FIKSI
    }

    private String judul;
    private List<String> penulis;
    private Kategori kategori;

    // Konstruktor
    public BukuFile(String judul, List<String> penulis, Kategori kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public Kategori getKategori() {
        return kategori;
    }

    // Method untuk menampilkan informasi buku
    public void displayBuku() {
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + String.join(", ", penulis));
        System.out.println("----------------------");
    }
}
