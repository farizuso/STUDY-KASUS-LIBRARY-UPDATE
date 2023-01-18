package entity;

public class Akun {
    protected String nik;
    protected String password;

    public Akun() {
    }

    public String getNik() {
        return nik;
    }

    public String getPassword() {
        return password;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
