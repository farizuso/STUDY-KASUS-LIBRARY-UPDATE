package controller;

import entity.Buku;
import entity.Staff;
import models.Library;

import java.util.ArrayList;

public class BukuController implements InterfaceController{

    public  void lihatData() {
        for (Buku buku : Library.dataBuku) {

        }
    }
    @Override
    public  Buku findBukuById(int idbuku) {
        for (Buku buku : Library.dataBuku) {
            if (buku.getIdKoleksi()==(idbuku)){

                return buku;
            }
        }
        return null;
    }

    public  int indexData(Buku buku) {
        for (int i = 0;i<Library.dataBuku.size();i++){
            if (Library.dataBuku.get(i).getIdKoleksi()==buku.getIdKoleksi()){
                return i;
            }
        }
        return -1;
    }
    @Override
    public  Buku findBukuByTitle(String judul) {
        for (Buku buku : Library.dataBuku) {
            if (buku.getJudul().contains(judul)){
                return buku;
            }
        }
        return null;
    }
    @Override
    public  void tambahBuku(Buku buku){
        Library.dataBuku.add(buku);
    }
    @Override
    public  void updateBuku(Buku buku){
        int indexdataBuku = indexData(buku);
        if (indexdataBuku != -1){
            Library.dataBuku.set(indexdataBuku,buku);
        }
    }
    public  void deleteBuku(Buku buku){
        Library.dataBuku.remove(buku);
    }
    public  ArrayList<Buku> filterBukuByJudul(String judulBuku){
        ArrayList<Buku>_bukuFound = new ArrayList<>();

        for (Buku buku : Library.dataBuku){
            if (buku.getJudul().contains(judulBuku)){

                _bukuFound.add(buku);
            }
        }
        return _bukuFound;
    }
}
