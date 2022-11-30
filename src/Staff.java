public class Staff extends Akun{

    String NamaStuff;

    public Staff(String namaStuff, String nik, String password) {
        this.NamaStuff = namaStuff;
        this.nik = nik;
        this.password = password;
    }
    void tampilkan(){
        System.out.println("------Data Stuff------");
        System.out.println("Nama Stuff:"+NamaStuff);
        System.out.println("nik:"+nik);
        System.out.println("Password:"+password);
        System.out.println("\n");
    }
}
