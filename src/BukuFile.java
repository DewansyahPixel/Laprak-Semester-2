import java.util.ArrayList;
import java.util.List;

class BukuFile {
    private String judul;
    private String penulis;
    private String kategori;
    private String sinopsis;

    public BukuFile(String judul, String penulis, String kategori, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
    }

    public String getKategori() {
        return kategori;
    }
    public String getJudul() {
        return judul;
    }

    public void displayBuku() {
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("-------------------------");
    }

    public int hitungJumlahKataSinopsis() {
        if (sinopsis == null || sinopsis.length() == 0) {
            return 0;
        }
        int jumlahKata = 0;
        boolean dalamKata = false;
        for (int i = 0; i < sinopsis.length(); i++) {
            char c = sinopsis.charAt(i);
            if (c != ' ' && c != '\t' && c != '\n') {
                if (!dalamKata) {
                    jumlahKata++;
                    dalamKata = true;
                }
            } else {
                dalamKata = false;
            }
        }
        return jumlahKata;
    }

    public double cekTingkatKesamaan(BukuFile bukuLain) {
        int kesamaan = 0;
        int totalAtribut = 4;

        if (this.judul.equalsIgnoreCase(bukuLain.judul)) {
            kesamaan++;
        }
        if (this.penulis.equalsIgnoreCase(bukuLain.penulis)) {
            kesamaan++;
        }
        if (this.kategori.equalsIgnoreCase(bukuLain.kategori)) {
            kesamaan++;
        }
        if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)) {
            kesamaan++;
        }

        return (kesamaan / (double) totalAtribut) * 100;
    }

    public BukuFile copy() {
        return new BukuFile(this.judul, this.penulis, this.kategori, this.sinopsis);
    }

    public static List<BukuFile> getDaftarBuku() {
        List<BukuFile> daftarBuku = new ArrayList<>();

      // Teknologi
      daftarBuku.add(new BukuFile("Pemrograman Java", "James Gosling", "Teknologi", "Buku ini membahas dasar-dasar pemrograman Java dengan contoh kode yang jelas dan mudah dipahami."));
      daftarBuku.add(new BukuFile("Artificial Intelligence", "Stuart Russell", "Teknologi", "Buku ini mengupas konsep kecerdasan buatan dari dasar hingga penerapannya dalam berbagai aspek kehidupan."));
      daftarBuku.add(new BukuFile("Sistem Operasi", "Abraham Silberschatz", "Teknologi", "Buku ini menjelaskan konsep dasar sistem operasi mulai dari manajemen memori hingga sistem file."));
      daftarBuku.add(new BukuFile("Cyber Security Handbook", "Bruce Schneier", "Teknologi", "Buku panduan ini membahas langkah-langkah untuk melindungi data dari ancaman siber."));
      daftarBuku.add(new BukuFile("Blockchain Revolution", "Don Tapscott", "Teknologi", "Buku ini membahas bagaimana teknologi blockchain dapat mengubah industri keuangan, bisnis, dan masyarakat."));

      // Filsafat
      daftarBuku.add(new BukuFile("Filsafat Ilmu", "Jujun S. Suriasumantri", "Filsafat", "Buku ini membahas dasar-dasar filsafat ilmu dalam memahami metode ilmiah dan epistemologi."));
      daftarBuku.add(new BukuFile("Dunia Sophie", "Jostein Gaarder", "Filsafat", "Novel yang menjelaskan sejarah filsafat dari zaman Yunani kuno hingga modern dengan cara menarik."));
      daftarBuku.add(new BukuFile("Kritik Akal Murni", "Immanuel Kant", "Filsafat", "Karya fundamental dalam filsafat yang membahas batasan rasionalitas dan pengalaman manusia."));
      daftarBuku.add(new BukuFile("Republik", "Plato", "Filsafat", "Buku yang membahas konsep keadilan, negara ideal, dan peran filsuf dalam pemerintahan."));
      daftarBuku.add(new BukuFile("Being and Time", "Martin Heidegger", "Filsafat", "Karya besar Heidegger yang membahas eksistensi manusia dan konsep waktu."));

      // Sejarah
      daftarBuku.add(new BukuFile("Sejarah Peradaban Dunia", "Will Durant", "Sejarah", "Buku ini menggambarkan perkembangan peradaban manusia dari zaman kuno hingga modern."));
      daftarBuku.add(new BukuFile("Sejarah Islam", "Karen Armstrong", "Sejarah", "Buku ini membahas perjalanan Islam dari masa Nabi Muhammad hingga era modern."));
      daftarBuku.add(new BukuFile("Sejarah Revolusi Industri", "Robert Allen", "Sejarah", "Buku ini menjelaskan dampak revolusi industri terhadap ekonomi dan masyarakat."));
      daftarBuku.add(new BukuFile("Napoleon: A Biography", "Frank McLynn", "Sejarah", "Membahas biografi lengkap tentang kehidupan dan karier militer Napoleon Bonaparte."));
      daftarBuku.add(new BukuFile("Sejarah Perang Dunia II", "Antony Beevor", "Sejarah", "Analisis mendalam tentang peristiwa dan strategi dalam Perang Dunia II."));

      // Agama
      daftarBuku.add(new BukuFile("Islam dan Sains", "Harun Yahya", "Agama", "Buku ini membahas hubungan antara Islam dan sains dalam perspektif modern."));
      daftarBuku.add(new BukuFile("Tafsir Al-Misbah", "Quraish Shihab", "Agama", "Membahas tafsir Alquran yang menjelaskan ayat-ayat dengan pendekatan kontekstual."));
      daftarBuku.add(new BukuFile("Buddhism: A Very Short Introduction", "Damien Keown", "Agama", "Buku ini memberikan pengantar singkat tentang ajaran dan sejarah agama Buddha."));
      daftarBuku.add(new BukuFile("The Bible", "Various Authors", "Agama", "Buku suci umat Kristen yang terdiri dari Perjanjian Lama dan Perjanjian Baru."));
      daftarBuku.add(new BukuFile("Hinduism: Beliefs and Practices", "Klaus K. Klostermaier", "Agama", "Buku ini membahas tentang ajaran dan praktik dalam agama Hindu."));

      // Psikologi
      daftarBuku.add(new BukuFile("Psikologi Sosial", "David Myers", "Psikologi", "Buku ini menjelaskan bagaimana manusia berinteraksi dan mempengaruhi satu sama lain."));
      daftarBuku.add(new BukuFile("The Interpretation of Dreams", "Sigmund Freud", "Psikologi", "Freud menjelaskan teori tentang makna dan interpretasi mimpi dalam psikoanalisis."));
      daftarBuku.add(new BukuFile("Thinking, Fast and Slow", "Daniel Kahneman", "Psikologi", "Buku ini membahas bagaimana manusia berpikir secara intuitif dan rasional."));
      daftarBuku.add(new BukuFile("The Power of Habit", "Charles Duhigg", "Psikologi", "Buku ini menjelaskan tentang bagaimana kebiasaan terbentuk dan bagaimana mengubahnya."));
      daftarBuku.add(new BukuFile("Drive", "Daniel Pink", "Psikologi", "Buku ini mengungkap motivasi manusia dan faktor yang mendorong kesuksesan."));

      // Politik
      daftarBuku.add(new BukuFile("Das Kapital", "Karl Marx", "Politik", "Buku ini mengupas tentang teori ekonomi politik dari perspektif Marxis."));
      daftarBuku.add(new BukuFile("The Prince", "Niccolò Machiavelli", "Politik", "Buku ini membahas panduan klasik tentang kekuasaan dan strategi politik."));
      daftarBuku.add(new BukuFile("Democracy in America", "Alexis de Tocqueville", "Politik", "Membahas analisis mendalam tentang demokrasi di Amerika pada abad ke-19."));
      daftarBuku.add(new BukuFile("The Republic", "Plato", "Politik", "Membahas diskusi tentang negara ideal dan keadilan dalam filsafat politik."));
      daftarBuku.add(new BukuFile("The Communist Manifesto", "Karl Marx & Friedrich Engels", "Politik", "Buku ini menceritakan tentang dokumen fundamental dalam gerakan sosialis dan komunis."));

      // Fiksi
      daftarBuku.add(new BukuFile("To Kill a Mockingbird", "Harper Lee", "Fiksi", "Novel klasik yang mengangkat isu rasial dan keadilan di Amerika."));
      daftarBuku.add(new BukuFile("The Great Gatsby", "F. Scott Fitzgerald", "Fiksi", "Novel ini membahas tentang impian Amerika dan kehidupan sosial tahun 1920-an."));
      daftarBuku.add(new BukuFile("Pride and Prejudice", "Jane Austen", "Fiksi", "Menceritakan kisah romantis yang menggambarkan kehidupan masyarakat Inggris abad ke-19."));
      daftarBuku.add(new BukuFile("Moby-Dick", "Herman Melville", "Fiksi", "Sebuah novel petualangan tentang perburuan paus raksasa oleh Kapten Ahab."));
      daftarBuku.add(new BukuFile("War and Peace", "Leo Tolstoy", "Fiksi", "Mengisahkan epos sejarah yang menggambarkan Rusia pada masa Perang Napoleon."));

        return daftarBuku;
    }
}
