package controller;

import entity.Staff;
import models.Auth;
import models.Library;

public class LoginController {
    public boolean loginController(String nik, String password){
        Staff staff = Library.findStaff(nik);

        if (staff != null){
            if (staff.getPassword().equals(password)){
                Auth.staffLogged = staff;
                return true;
            }else {
                Auth.staffLogged = null;
            }
        }
        return false;
    }
    public void logout(){
        Auth.staffLogged = null;
    }
}

