import java.util.Scanner;

public class BukuPage {
    private Scanner input = new Scanner(System.in);

    private void lihatBuku(Buku buku){
        Penulis penulis = buku.penulis;
        Penerbit penerbit = buku.penerbit;

        System.out.println("---------------------------------------");
        System.out.println("ID Buku         :"+buku.idKoleksi);
        System.out.println("Judul Buku      :"+buku.judul);
        System.out.println("Jumlah Halaman  :"+buku.halaman);
        if (penulis != null){
            System.out.println("Nama Penulis    :"+penulis.nama);
        }else {
            System.out.println("Nama Penulis    : Tidak diketahui");
        }
        if (penerbit != null){
            System.out.println("Penerbit        :"+penerbit.nama);
            System.out.println("Alamat penerbit :"+penerbit.AlamatPenerbit);
        }else {
            System.out.println("Penerbit        : Tidak diketahui");
        }
            System.out.println("Tanggal Terbit  :"+buku.tanggalTerbit);
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
        System.out.print("Judul Buku          :");
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

        System.out.println("Berhasil Menambahkan Buku");

        System.out.println("=======================================");

        System.out.print("Lanjut ...");
        input.nextLine();
        System.out.println();
    }
    public void editBuku(Buku buku, int pilihEdit) {
        switch (pilihEdit) {
            case 1:
                String judulBukuBaru;
                System.out.println("Judul Buku          : " + buku.judul);
                System.out.print("Masukan Judul Baru  : ");
                judulBukuBaru = input.nextLine();
                buku.setJudul(judulBukuBaru);
                break;
            case 2:
                int jmlHalaman;
                System.out.println("Jumlah Halaman              : " + buku.halaman);
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
                1. Judul Buku
                2. Jumlah Halaman
                3. Tanggal Terbit
                4. Penulis
                5. Penerbit
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

        System.out.print("Masukan ID Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        Buku buku = Library.findBukuById(idKoleksi);

        if (buku != null) {
            editBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
    }

    private void hapusBuku(Buku buku) {
        System.out.println("============ KONFIRMASI ============");

        lihatBuku(buku);

        System.out.println("Ingin Menghapus Buku ini ? (y/n) ");
        char konf = input.nextLine().charAt(0);

        if (konf == 'y') {
            Library.deleteBuku(buku);
        }

    }

    public void hapusBuku() {
        int idKoleksi;

        System.out.println("============ HAPUS  BUKU ============");

        System.out.print("Masukan ID Buku: ");
        idKoleksi = input.nextInt();
        input.nextLine();

        Buku buku = Library.findBukuById(idKoleksi);

        if (buku != null) {
            hapusBuku(buku);
        } else {
            System.out.println("Data Buku Tidak Ditemukan !");
        }

        System.out.println("=======================================");
    }
    public void findBukuById () {
        int idbuku;
        System.out.printf("masukkan id buku:");
        idbuku = input.nextInt();
        input.nextLine();

        for (Buku buku : Library.dataBuku) {
            if (buku.idKoleksi==(idbuku)){
                System.out.println("--------------------------------");
                System.out.println("ID BUKU:" + buku.idKoleksi);
                System.out.println("Halaman:" + buku.halaman);
                System.out.println("Judul:" + buku.judul);
                System.out.println("tahun terbit:" + buku.tanggalTerbit);
                System.out.println("penulis:"+buku.penulis.nama);
                System.out.println("penerbit:"+buku.penerbit.nama);
                System.out.println("Alamat penerbit :"+buku.penerbit.AlamatPenerbit);
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
            if (buku.judul.equals(judul)) {
                System.out.println("--------------------------------");
                System.out.println("ID BUKU:" + buku.idKoleksi);
                System.out.println("Halaman:" + buku.halaman);
                System.out.println("Judul:" + buku.judul);
                System.out.println("tahun terbit:" + buku.tanggalTerbit);
                System.out.println("penulis:" + buku.penulis.nama);
                System.out.println("penerbit:" + buku.penerbit.nama);
                System.out.println("Alamat penerbit :"+buku.penerbit.AlamatPenerbit);
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
            if (buku.judul.contains(judul)){
                System.out.println("--------------------------------");
                System.out.println("ID BUKU:" + buku.idKoleksi);
                System.out.println("Halaman:" + buku.halaman);
                System.out.println("Judul:" + buku.judul);
                System.out.println("tahun terbit:" + buku.tanggalTerbit);
                System.out.println("penulis:" + buku.penulis.nama);
                System.out.println("penerbit:" + buku.penerbit.nama);
                System.out.println("Alamat penerbit :"+buku.penerbit.AlamatPenerbit);
                System.out.println("--------------------------------");

                Library.filterBukuByJudul(judul);
            }
        }

    }
}
