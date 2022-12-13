package Entity;
import Models.*;

public class Buku extends Koleksi {
    // Atribut Class Entity.Buku
   private String judul;
    private int halaman;
    private String tanggalTerbit;
    private Penulis penulis;
    private Penerbit penerbit;

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
            // Jika ArrayList Entity.Buku TIDAK Kosong, maka

            // Ambil index Terakhir dalam List
            int indexTerakhirDalamList = Library.dataBuku.size() - 1;

            // Ambil Object Entity.Buku dalam List berdasarkan indexnya.
            Buku bukuTerakhirDalamList = Library.dataBuku.get(indexTerakhirDalamList);

            // Ambil idBuku pada Object Entity.Buku terakhir
            int idBukuTerakhir = bukuTerakhirDalamList.idKoleksi;

            // Id Entity.Buku yang baru
            this.idKoleksi = idBukuTerakhir + 1;
        }
    }

    // Method
    public void dataBuku() {
        System.out.println("ID Entity.Buku         : " + idKoleksi);
        System.out.println("Judul Entity.Buku      : " + judul);
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

    public String getJudul() {
        return judul;
    }

    public int getHalaman() {
        return halaman;
    }

    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public Penerbit getPenerbit() {
        return penerbit;
    }
}