import Controller.Auth;
import Controller.LoginPage;

public class App {
    public static void main(String[] args) {
        Auth.initialStaff();
        new LoginPage();
    }
}


