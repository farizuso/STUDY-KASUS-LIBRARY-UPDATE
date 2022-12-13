package Entity;

import Entity.Identitas;

public class Penulis extends Identitas {
   private String emailPenulis;

    public Penulis(String namaPenulis) {
        this.nama = namaPenulis;
        this.emailPenulis = "-";
    }
    public Penulis(String namaPenulis,String emailPenulis){
        this.nama = namaPenulis;
        this.emailPenulis = emailPenulis;
    }

    public void dataPenulis() {
        System.out.println("Nama Entity.Penulis    : " + nama);
        System.out.println("Email Entity.Penulis   : " +emailPenulis);
    }
    public String getEmailPenulis() {
        return emailPenulis;
    }
}
