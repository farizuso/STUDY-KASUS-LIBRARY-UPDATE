package entity;

public class Staff extends Akun {
    public static Staff staffLogged;
    private String NamaStuff;

    public Staff(String namaStuff, String nik, String password) {
        this.NamaStuff = namaStuff;
        this.nik = nik;
        this.password = password;
    }

    public String getNamaStuff() {
        return NamaStuff;
    }

    public void setNamaStuff(String namaStuff) {
        NamaStuff = namaStuff;
    }
}
