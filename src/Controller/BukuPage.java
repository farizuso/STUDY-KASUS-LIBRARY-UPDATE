package Controller;

import Entity.Buku;
import Entity.Penerbit;
import Entity.Penulis;
import Models.*;


import java.util.Scanner;

public class BukuPage {
    private Scanner input = new Scanner(System.in);

    private void lihatBuku(Buku buku){
        Penulis penulis = buku.getPenulis();
        Penerbit penerbit = buku.getPenerbit();

        System.out.println("---------------------------------------");
        System.out.println("ID Entity.Buku         :"+buku.getIdKoleksi());
        System.out.println("Judul Entity.Buku      :"+buku.getJudul());
        System.out.println("Jumlah Halaman  :"+buku.getHalaman());
        if (penulis != null){
            System.out.println("Nama Penulis    :"+penulis.getNama());
        }else {
            System.out.println("Nama Penulis    : Tidak diketahui");
        }
        if (penerbit != null){
            System.out.println("Penerbit        :"+penerbit.getNama());
            System.out.println("Alamat penerbit :"+penerbit.getAlamatPenerbit());
        }else {
            System.out.println("Penerbit        : Tidak diketahui");
        }
            System.out.println("Tanggal Terbit  :"+buku.getTanggalTerbit());
            System.out.println("---------------------------------------");
    }
    public void lihatbuku(){
        System.out.println("============== LIHAT BUKU =============");
        for (Buku buku : Library.dataBuku){
            lihatBuku(buku);
        }
        System.out.println("=======================================");

        System.out.print("Lanjut....");
        input.nextLine();
        System.out.println();
    }
    public void tambahBuku() {
        String judul;
        int halaman;
        String tanggalterbit;
        Penulis penulis = null;
        Penerbit penerbit = null;

        System.out.println("============ TAMBAH BUKU ============");
        System.out.print("Judul Entity.Buku          :");
        judul = input.nextLine();

        System.out.print("Jumlah Halaman      :");
        halaman = input.nextInt();
        input.nextLine();

        System.out.print("Tanggal Terbit      :");
        tanggalterbit = input.nextLine();

        System.out.print("Masukkan Penulis  (y/n) ?");
        char masukkanPenulis = input.next().charAt(0);
        input.nextLine();

        if (masukkanPenulis == 'y') {
            String namaPenulis;
            System.out.print("Nama Penulis        :");
            namaPenulis = input.nextLine();
            penulis = new Penulis(namaPenulis);
        }

        System.out.print("Masukan Penerbit (y/n) ? ");
        char masukanPenerbit = input.nextLine().charAt(0);

        if (masukanPenerbit == 'y') {
            String namaPenerbit, alamatPenerbit;

            System.out.print("Nama Penerbit       :");
            namaPenerbit = input.nextLine();

            System.out.print("Alamat Penerbit     :");
            alamatPenerbit = input.nextLine();
            penerbit = new Penerbit(namaPenerbit,alamatPenerbit);
        }
        Buku bukuBaru = new Buku(judul,halaman,tanggalterbit, penulis,penerbit,true);
        Library.tambahBuku(bukuBaru);

        System.out.println("Berhasil Menambahkan Entity.Buku");

        System.out.println("=======================================");

        System.out.print("Lanjut ...");
        input.nextLine();
        System.out.println();
    }
    public void editBuku(Buku buku, int pilihEdit) {
        switch (pilihEdit) {
            case 1:
                String judulBukuBaru;
                System.out.println("Judul Entity.Buku          : " + buku.getJudul());
                System.out.print("Masukan Judul Baru  : ");
                judulBukuBaru = input.nextLine();
                buku.setJudul(judulBukuBaru);
                break;
            case 2:
                int jmlHalaman;
                System.out.println("Jumlah Halaman              : " + buku.getHalaman());
                System.out.print("Masukan Jumlah Halaman Baru : ");
                jmlHalaman = input.nextInt();
                input.nextLine();
                buku.setHalaman(jmlHalaman);
                break;
        }
        Library.updateBuku(buku);
        System.out.println("Berhasil mengubah data buku");

        System.out.println("Lanjut....");
        input.nextLine();
        System.out.println();
    }

    public void editBuku(Buku buku) {
        System.out.println("---------------------------------------");
        System.out.println("Ingin mengubah apa ? ");

        int pilihEdit;
        System.out.print("""
                1. Judul Entity.Buku
                2. Jumlah Halaman
                3. Tanggal Terbit
                4. Entity.Penulis
                5. Entity.Penerbit
                6. Status
                0. Selesai
                Pilih: """);
        pilihEdit = input.nextInt();
        input.nextLine();

        editBuku(buku, pilihEdit);
        System.out.println("---------------------------------------");
    }

    public void editBuku() {
        int idKoleksi;

        System.out.println("============= EDIT BUKU =============");

        System.out.print("Masukan ID Entity.Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        Buku buku = Library.findBukuById(idKoleksi);

        if (buku != null) {
            editBuku(buku);
        } else {
            System.out.println("Data Entity.Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
    }

    private void hapusBuku(Buku buku) {
        System.out.println("============ KONFIRMASI ============");

        lihatBuku(buku);

        System.out.println("Ingin Menghapus Entity.Buku ini ? (y/n) ");
        char konf = input.nextLine().charAt(0);

        if (konf == 'y') {
            Library.deleteBuku(buku);
        }

    }

    public void hapusBuku() {
        int idKoleksi;

        System.out.println("============ HAPUS  BUKU ============");

        System.out.print("Masukan ID Entity.Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        Buku buku = Library.findBukuById(idKoleksi);

        if (buku != null) {
            hapusBuku(buku);
        } else {
            System.out.println("Data Entity.Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
    }
    public void findBukuById () {
        int idbuku;
        System.out.printf("masukkan id buku:");
        idbuku = input.nextInt();
        input.nextLine();

        for (Buku buku : Library.dataBuku) {
            if (buku.getIdKoleksi()==(idbuku)){
                System.out.println("--------------------------------");
                System.out.println("ID BUKU:" + buku.getIdKoleksi());
                System.out.println("Halaman:" + buku.getHalaman());
                System.out.println("Judul:" + buku.getJudul());
                System.out.println("tahun terbit:" + buku.getTanggalTerbit());
                System.out.println("penulis:"+ buku.getPenulis().getNama());
                System.out.println("penerbit:"+ buku.getPenerbit().getNama());
                System.out.println("Alamat penerbit :"+ buku.getPenerbit().getAlamatPenerbit());
                System.out.println("--------------------------------");

                Library.findBukuById(idbuku);
            }
        }
    }
    public void findBukuByTitle() {
        String judul;
        System.out.printf("masukkan judul buku:");
        judul = input.nextLine();

        for (Buku buku : Library.dataBuku) {
            if (buku.getJudul().equals(judul)) {
                System.out.println("--------------------------------");
                System.out.println("ID BUKU:" + buku.getIdKoleksi());
                System.out.println("Halaman:" + buku.getHalaman());
                System.out.println("Judul:" + buku.getJudul());
                System.out.println("tahun terbit:" + buku.getTanggalTerbit());
                System.out.println("penulis:" + buku.getPenulis().getNama());
                System.out.println("penerbit:" + buku.getPenerbit().getNama());
                System.out.println("Alamat penerbit :"+ buku.getPenerbit().getAlamatPenerbit());
                System.out.println("--------------------------------");

                Library.findBukuByTitle(judul);
            }
        }
    }
    public void filterBukuByAbjad(){

        String judul;
        System.out.print("masukkan huruf :");
        judul = input.nextLine();

        for (Buku buku : Library.dataBuku){
            if (buku.getJudul().contains(judul)){
                System.out.println("--------------------------------");
                System.out.println("ID BUKU:" + buku.getIdKoleksi());
                System.out.println("Halaman:" + buku.getHalaman());
                System.out.println("Judul:" + buku.getJudul());
                System.out.println("tahun terbit:" + buku.getTanggalTerbit());
                System.out.println("penulis:" + buku.getPenulis().getNama());
                System.out.println("penerbit:" + buku.getPenerbit().getNama());
                System.out.println("Alamat penerbit :"+ buku.getPenerbit().getAlamatPenerbit());
                System.out.println("--------------------------------");

                Library.filterBukuByJudul(judul);
            }
        }

    }
}
