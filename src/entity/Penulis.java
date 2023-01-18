package entity;

public class Penulis extends Identitas {
    private String emailPenulis;

    public Penulis() {

    }

    public Penulis(String namaPenulis) {
        this.nama = namaPenulis;
        this.emailPenulis = "-";
    }

    public Penulis(String namaPenulis, String emailPenulis) {
        this.nama = namaPenulis;
        this.emailPenulis = emailPenulis;
    }

    // Method
    public void dataPenulis() {
        System.out.println("Nama Penulis    :" + nama);
        System.out.println("Email Penulis :" + emailPenulis);

    }

    public String getEmailPenulis() {
        return emailPenulis;
    }

    public void setEmailPenulis(String emailPenulis) {
        this.emailPenulis = emailPenulis;
    }
}
