public class Buku extends Koleksi {
    // Atribut Class Buku
    String judul;
    int halaman;
    String tanggalTerbit;
    Penulis penulis;
    Penerbit penerbit;

    // Constructor
    public Buku() {
    }

    // Constructor
    public Buku(String judul, int halaman, String tanggalTerbit, boolean status) {
        idBukuBaru();
        this.judul = judul;
        this.halaman = halaman;
        this.tanggalTerbit = tanggalTerbit;
        this.penulis = null;
        this.penerbit = null;
        this.status = status;
    }

    // Constructor dengan Parameter
    public Buku(String judul,
                int halaman, String tanggalTerbit,
                Penulis penulis, Penerbit penerbit, boolean status) {
        idBukuBaru();
        this.judul = judul;
        this.halaman = halaman;
        this.tanggalTerbit = tanggalTerbit;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.status = status;
    }

    private void idBukuBaru() {
        if (Library.dataBuku.size() == 0) {
            // Jika ArrayList buku MASIH Kosong,
            // maka atur idBuku menjadi 1
            this.idKoleksi = 1;
        } else {
            // Jika ArrayList Buku TIDAK Kosong, maka

            // Ambil index Terakhir dalam List
            int indexTerakhirDalamList = Library.dataBuku.size() - 1;

            // Ambil Object Buku dalam List berdasarkan indexnya.
            Buku bukuTerakhirDalamList = Library.dataBuku.get(indexTerakhirDalamList);

            // Ambil idBuku pada Object Buku terakhir
            int idBukuTerakhir = bukuTerakhirDalamList.idKoleksi;

            // Id Buku yang baru
            this.idKoleksi = idBukuTerakhir + 1;
        }
    }

    // Method
    public void dataBuku() {
        System.out.println("ID Buku         : " + idKoleksi);
        System.out.println("Judul Buku      : " + judul);
        System.out.println("Jumlah Halaman  : " + halaman);
        System.out.println("Tanggal Terbit  : " + tanggalTerbit);
    }

    // Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Setter
    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

}