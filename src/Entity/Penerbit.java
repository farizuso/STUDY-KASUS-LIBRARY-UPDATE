package Entity;

import Entity.Identitas;

public class Penerbit extends Identitas {
    private String AlamatPenerbit;

    public  Penerbit(){

    }

    public Penerbit(String namaPenerbit) {
        this.nama = namaPenerbit;
        this.AlamatPenerbit = "-";
    }
    public Penerbit(String namapenerbit,String alamatPenerbit){
        this.nama = namapenerbit;
        this.AlamatPenerbit = alamatPenerbit;
    }
    public void dataPenerbit(){
        System.out.println("------Entity.Penerbit------");
        System.out.println("Nama Entity.Penerbit:"+nama);
        System.out.println("Alamat Entity.Penerbit:"+AlamatPenerbit);
    }

    public String getAlamatPenerbit() {
        return AlamatPenerbit;
    }
}
