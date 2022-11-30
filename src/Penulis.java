public class Penulis extends Identitas {
//    String NamaPenulis;
    String emailPenulis;

    public Penulis(String namaPenulis) {
        this.nama = namaPenulis;
        this.emailPenulis = "-";
    }
    public Penulis(String namaPenulis,String emailPenulis){
        this.nama = namaPenulis;
        this.emailPenulis = emailPenulis;
    }

    public void dataPenulis() {
        System.out.println("Nama Penulis    : " + nama);
        System.out.println("Email Penulis   : " +emailPenulis);
    }
}
