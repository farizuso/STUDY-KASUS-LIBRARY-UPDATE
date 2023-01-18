package models;

import entity.Staff;
import models.*;

public class Auth {
   public static Staff staffLogged = null;

   public static void initialStaff(){
       Staff staff1 = new Staff("Poseidon","07457","888321");
       Staff staff2 = new Staff("akbar","12345","123");

       Library.staffAktif.add(staff1);
       Library.staffAktif.add(staff2);
   }
   public static boolean login(String nik, String password){
       Staff staff = Library.findStaff(nik);

       if (staff != null){
           if (staff.getPassword().equals(password)){
               staffLogged = staff;
               return true;
           }else {
               staffLogged = null;
           }
       }
       return false;
   }

    public static Staff getStaffLogged() {
        return staffLogged;
    }

    public static void setUserLogged(Staff staffLogged) {
        Staff.staffLogged = staffLogged;
    }
   public static void logout(){
     staffLogged = null;
   }
}
