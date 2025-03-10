import java.util.ArrayList;
import java.util.List;

public class Laprak1 {
    public static void main(String[] args) {
        List<BukuFile> buku = new ArrayList<>();

        // Menambahkan buku untuk tiap kategori
        buku.add(new BukuFile("Dasar-dasar Java", List.of("James Gosling"), BukuFile.Kategori.TEKNOLOGI));
        buku.add(new BukuFile("Pemrograman Python", List.of("Guido van Rossum"), BukuFile.Kategori.TEKNOLOGI));
        buku.add(new BukuFile("Machine Learning", List.of("Andrew Ng"), BukuFile.Kategori.TEKNOLOGI));
        buku.add(new BukuFile("Keamanan Siber", List.of("Bruce Schneier"), BukuFile.Kategori.TEKNOLOGI));
        buku.add(new BukuFile("Blockchain 101", List.of("Satoshi Nakamoto"), BukuFile.Kategori.TEKNOLOGI));

        buku.add(new BukuFile("Filsafat Yunani", List.of("Plato"), BukuFile.Kategori.FILSAFAT));
        buku.add(new BukuFile("Eksistensialisme", List.of("Jean-Paul Sartre"), BukuFile.Kategori.FILSAFAT));
        buku.add(new BukuFile("Etika", List.of("Aristoteles"), BukuFile.Kategori.FILSAFAT));
        buku.add(new BukuFile("Filsafat Timur", List.of("Lao Tzu"), BukuFile.Kategori.FILSAFAT));
        buku.add(new BukuFile("Filsafat Modern", List.of("Immanuel Kant"), BukuFile.Kategori.FILSAFAT));

        buku.add(new BukuFile("Sejarah Dunia", List.of("H.G. Wells"), BukuFile.Kategori.SEJARAH));
        buku.add(new BukuFile("Sejarah Islam", List.of("Karen Armstrong"), BukuFile.Kategori.SEJARAH));
        buku.add(new BukuFile("Perang Dunia II", List.of("Antony Beevor"), BukuFile.Kategori.SEJARAH));
        buku.add(new BukuFile("Revolusi Industri", List.of("Robert Allen"), BukuFile.Kategori.SEJARAH));
        buku.add(new BukuFile("Napoleon Bonaparte", List.of("Alan Forrest"), BukuFile.Kategori.SEJARAH));

        buku.add(new BukuFile("Islam dan Modernitas", List.of("Fazlur Rahman"), BukuFile.Kategori.AGAMA));
        buku.add(new BukuFile("Kristologi", List.of("Ahmed Deedat"), BukuFile.Kategori.AGAMA));
        buku.add(new BukuFile("Bhagavad Gita", List.of("Vyasa"), BukuFile.Kategori.AGAMA));
        buku.add(new BukuFile("Talmud", List.of("Rabbi Judah"), BukuFile.Kategori.AGAMA));
        buku.add(new BukuFile("Sejarah Buddhisme", List.of("Thich Nhat Hanh"), BukuFile.Kategori.AGAMA));

        buku.add(new BukuFile("Psikologi Kepribadian", List.of("Sigmund Freud"), BukuFile.Kategori.PSIKOLOGI));
        buku.add(new BukuFile("Psikologi Sosial", List.of("Philip Zimbardo"), BukuFile.Kategori.PSIKOLOGI));
        buku.add(new BukuFile("Kecerdasan Emosional", List.of("Daniel Goleman"), BukuFile.Kategori.PSIKOLOGI));
        buku.add(new BukuFile("Behaviorisme", List.of("B.F. Skinner"), BukuFile.Kategori.PSIKOLOGI));
        buku.add(new BukuFile("Teori Kognitif", List.of("Jean Piaget"), BukuFile.Kategori.PSIKOLOGI));

        buku.add(new BukuFile("Politik Demokrasi", List.of("Robert Dahl"), BukuFile.Kategori.POLITIK));
        buku.add(new BukuFile("Machiavellianisme", List.of("Niccolò Machiavelli"), BukuFile.Kategori.POLITIK));
        buku.add(new BukuFile("Politik Global", List.of("Samuel Huntington"), BukuFile.Kategori.POLITIK));
        buku.add(new BukuFile("Teori Kritis", List.of("Jürgen Habermas"), BukuFile.Kategori.POLITIK));
        buku.add(new BukuFile("Revolusi Sosial", List.of("Karl Marx"), BukuFile.Kategori.POLITIK));

        buku.add(new BukuFile("Harry Potter", List.of("J.K. Rowling"), BukuFile.Kategori.FIKSI));
        buku.add(new BukuFile("Lord of the Rings", List.of("J.R.R. Tolkien"), BukuFile.Kategori.FIKSI));
        buku.add(new BukuFile("Dune", List.of("Frank Herbert"), BukuFile.Kategori.FIKSI));
        buku.add(new BukuFile("Sherlock Holmes", List.of("Arthur Conan Doyle"), BukuFile.Kategori.FIKSI));
        buku.add(new BukuFile("1984", List.of("George Orwell"), BukuFile.Kategori.FIKSI));

        // Menampilkan semua kategori dan buku
        for (BukuFile.Kategori kategori : BukuFile.Kategori.values()) {
            System.out.println("\nKategori: " + kategori);
            for (BukuFile bukuItem : buku) {
                if (bukuItem.getKategori() == kategori) {
                    bukuItem.displayBuku();
                }
            }
        }
    }
}
