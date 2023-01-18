package controller;

import entity.Staff;
import models.Library;

public class StaffController {
    public Staff findStaff(String nik) {
        for (Staff staff : Library.staffAktif) {
            if (staff.getNik().equals(nik)) {
                return staff;
            }
        }
        return null;
    }
}
