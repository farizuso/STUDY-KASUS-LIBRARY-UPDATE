import java.util.ArrayList;

public class Library {
    static ArrayList<Buku> dataBuku = new ArrayList<>();
    static ArrayList<Staff> staffAktif = new ArrayList<>();
    public static int banyakData() {
        return dataBuku.size();
    }
//    public static void initialBuku() {
//        Penulis penulis = new Penulis("Agus Budi Cahyani");
//        Penerbit penerbit = new Penerbit("PT Cetak Buku");
//        Buku buku1 = new Buku("Judul 1", 123, "01/01/2000", penulis, penerbit, true);
//
//        Buku buku2 = new Buku("Judul 2", 200, "01/01/2000", null, null, true);
//
//        dataBuku.add(buku1);
//        dataBuku.add(buku2);
//    }
    public static Staff findStaff(String nik) {
        for (Staff staff : staffAktif) {
            if (staff.nik.equals(nik)) {
                return staff;
            }
        }
        return null;
    }

    public static void lihatData() {
        for (Buku buku : dataBuku) {

        }
    }

    public static Buku findBukuById(int idbuku) {
        for (Buku buku : dataBuku) {
            if (buku.idKoleksi==(idbuku)){

                return buku;
            }
        }
        return null;
    }

    public static int indexData(Buku buku) {
        for (int i = 0;i<dataBuku.size();i++){
            if (dataBuku.get(i).idKoleksi==buku.idKoleksi){
                return i;
            }
        }
        return -1;
    }

    public static Buku findBukuByTitle(String judul) {
        for (Buku buku : dataBuku) {
            if (buku.judul.contains(judul)){
                return buku;
            }
        }
        return null;
    }

    public static void tambahBuku(Buku buku){
        dataBuku.add(buku);
    }

    public static void updateBuku(Buku buku){
        int indexdataBuku = indexData(buku);
        if (indexdataBuku != -1){
            dataBuku.set(indexdataBuku,buku);
        }
    }
    public static void deleteBuku(Buku buku){
        dataBuku.remove(buku);
    }
    public static ArrayList<Buku> filterBukuByJudul(String judulBuku){
        ArrayList<Buku>_bukuFound = new ArrayList<>();

        for (Buku buku : dataBuku){
            if (buku.judul.contains(judulBuku)){

                _bukuFound.add(buku);
            }
        }
        return _bukuFound;
    }
}
