package controller;

import entity.Buku;

public interface InterfaceController {
    public Object findBukuById(int idbuku);

    public Object findBukuByTitle(String judul);

    public void tambahBuku(Buku buku);

    public void updateBuku(Buku buku);

}
