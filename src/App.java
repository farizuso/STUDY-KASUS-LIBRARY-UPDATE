import models.Auth;
import views.DashboardFrame;
import views.LoginFrame;
import views.LoginPage;

public class App {
    public static void main(String[] args) {
        Auth.initialStaff();
//        new LoginPage();
        new LoginFrame().setVisible(true);

//        new  DashboardFrame().setVisible(true);
    }
}