package controller;

import entity.Buku;
import entity.Staff;
import models.Auth;
import models.Library;

import java.util.ArrayList;

public class DashboardController {
    public void toView() {

    }
    public Staff StaffLogged() {
        return Auth.getStaffLogged();
    }
    public ArrayList<Buku> databuku(){
        return Library.dataBuku;
    }

    public void delete(int index) {
       Library.delete(index);
    }

}
