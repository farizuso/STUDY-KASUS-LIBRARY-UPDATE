package entity;

public class Penerbit extends Identitas {
    String alamatPenerbit;

    public String getAlamatPenerbit() {
        return alamatPenerbit;
    }

    public void setAlamatPenerbit(String alamatPenerbit) {
        this.alamatPenerbit = alamatPenerbit;
    }

    public Penerbit() {

    }

    public Penerbit(String namaPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = "-";
    }

    public Penerbit(String namaPenerbit, String alamatPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    // Method
    public void dataPenerbit() {
        System.out.println("Nama Penerbit     :" + nama);
        System.out.println("Alamat Penerbit :" + alamatPenerbit);

    }
}
