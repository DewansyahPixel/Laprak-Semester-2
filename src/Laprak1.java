import java.util.List;

public class Laprak1 {
    public static void main(String[] args) {
        List<BukuFile> daftarBuku = BukuFile.getDaftarBuku();

        // Menampilkan daftar buku berdasarkan kategori
        String kategoriSaatIni = "";
        for (BukuFile buku : daftarBuku) {
            if (!buku.getKategori().equals(kategoriSaatIni)) {
                kategoriSaatIni = buku.getKategori();
                System.out.println("\nKategori: " + kategoriSaatIni);
                System.out.println("-------------------------");
            }
            buku.displayBuku();
        }

        // method cekTingkatKesamaan
        BukuFile buku1 = daftarBuku.get(0);
        BukuFile buku2 = daftarBuku.get(1);
        System.out.println("Tingkat kesamaan antara " + buku1.getJudul() + " dan " + buku2.getJudul()+ ": " + buku1.cekTingkatKesamaan(buku2) + "%");

        //  method copy
        BukuFile bukuCopy = buku1.copy();
        System.out.println("Salinan buku:");
        bukuCopy.displayBuku();
    }
}
