package views;

import controller.AuthController;
import models.Auth;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends MainFrame {
//    public void setVisible(boolean b) {
//    }
    private JLabel iconLabel;
    private JLabel titleLabel;

    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton masukBtn, daftarBtn;

    private AuthController _authC = new AuthController();

    public LoginFrame() {
        super("LOGIN", 400, 600);
    }

    @Override
    protected void component() {
        ImageIcon imgLoad = loadImage("src/assets/P.png", 195, 195);
        iconLabel = new JLabel(imgLoad);
        boundedAdd(iconLabel, 103, 30, 195, 195);

        titleLabel = new JLabel("LOGIN");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel, Font.BOLD);
        boundedAdd(titleLabel, 155, 245, 92, 40);

        usernameLabel = new JLabel("username");
        setFontSize(usernameLabel, 12);
        setFontStyle(usernameLabel, Font.BOLD);
        boundedAdd(usernameLabel, 172, 305, 56, 16);

        usernameField = new JTextField();
        usernameField.setBackground(color("#FA7F7F"));
        boundedAdd(usernameField, 35, 325, 333, 32);

        passwordLabel = new JLabel("Password");
        setFontSize(passwordLabel, 12);
        setFontStyle(passwordLabel, Font.BOLD);
        boundedAdd(passwordLabel, 172, 375, 55, 16);

        passwordField = new JPasswordField();
        passwordField.setBackground(color("#FA7F7F"));
        boundedAdd(passwordField, 35, 395, 333, 32);

        masukBtn = new JButton("Masuk");
        masukBtn.setBackground(color("#35807B")); // #00D4FF
        masukBtn.setForeground(color("#FFFFFF"));
        masukBtn.setFocusPainted(false);
        boundedAdd(masukBtn, 158, 467, 85, 32);

//        daftarBtn = new JButton("daftar disini");
//        daftarBtn.setBackground(color("#F0F0F0"));
//        daftarBtn.setFocusPainted(false);
//        daftarBtn.setBorderPainted(false);
//        setFontSize(daftarBtn, 10);
//        boundedAdd(daftarBtn, 158, 506, 85, 32);
    }

    @Override
    protected void event() {
        masukBtn.addActionListener((e) -> {
            String nik = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            boolean status = _authC.login(nik, password);

            if (Auth.login(nik,password)) {
                // View Dashboard / View Home
                new DashboardFrame().setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Username atau Password Salah",
                        "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }

        });
    }

}
