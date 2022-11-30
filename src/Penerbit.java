public class Penerbit extends Identitas{
    String AlamatPenerbit;

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
        System.out.println("------Penerbit------");
        System.out.println("Nama Penerbit:"+nama);
        System.out.println("Alamat Penerbit:"+AlamatPenerbit);
    }
}
