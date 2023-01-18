package controller;

import models.Auth;
import models.Library;
import entity.Staff;
import views.LoginFrame;


public class AuthController {

    public void toViewLogin() {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
    public boolean login(String nik, String password) {
        Staff staff = Library.findStaff(nik);

        if (staff != null){
            if (staff.getPassword().equals(password)) {
                Auth.staffLogged = staff;
                return true;
            } else {
                Auth.staffLogged = null;
            }
        }
        return false;
    }
}
