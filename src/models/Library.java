package models;

import entity.Buku;
import entity.Staff;



import java.util.ArrayList;

public class Library {
    public static ArrayList<Buku> dataBuku = new ArrayList<>();

    public  static ArrayList<Buku> getDataBuku(){
        return dataBuku;
    }
    public static ArrayList<Staff> staffAktif = new ArrayList<>();
    public static int banyakData() {
        return dataBuku.size();
    }



        public static Staff findStaff(String nik) {
        for (Staff staff : staffAktif) {
            if (staff.getNik().equals(nik)) {
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
            if (buku.getIdKoleksi()==(idbuku)){

                return buku;
            }
        }
        return null;
    }

    public static int indexData(Buku buku) {
        for (int i = 0;i<dataBuku.size();i++){
            if (dataBuku.get(i).getIdKoleksi()==buku.getIdKoleksi()){
                return i;
            }
        }
        return -1;
    }

    public static Buku findBukuByTitle(String judul) {
        for (Buku buku : dataBuku) {
            if (buku.getJudul().contains(judul)){
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
            if (buku.getJudul().contains(judulBuku)){

                _bukuFound.add(buku);
            }
        }
        return _bukuFound;
    }
    public static void delete(int index) {
        dataBuku.remove(index);
    }
}
