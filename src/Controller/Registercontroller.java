package Controller;

import Model.Database;
import Model.Admin;
import Model.Main;
import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Registercontroller implements ActionListener {
    private Main model;
    private Register view;
    private Database db = new Database();
    
    public Registercontroller() {
        model = new Main();
        view = new Register();
        view.setVisible(true);
        view.addActionListener(this);
        db.connect();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSubmit())){
            try {
                if(view.getTfNIK().getText().equals("")||view.getTfName().getText().equals("")||view.getTfUsername().getText().equals("")||
                    view.getTfPassword().toString().equals("")||view.getTfconfirm().getText().equals("")){
                        JOptionPane.showMessageDialog(view, "All data must be filled");
                } else {
                    String username = view.getTfUsername().getText();
                    String password = view.getTfPassword().getText();
                    String nik = view.getTfNIK().getText();
                    String nama = view.getTfName().getText();
                    Admin a = new Admin(username, password, nik, nama);
                    model.createAdmin(a);
                    JOptionPane.showMessageDialog(view, "Signed Up");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(view, e.getMessage());
            }
            view.setTfNik("");
            view.setTfName("");
            view.setTfPassword("");
            view.setTfUsernameSignUp("");
            view.setTfconfirm("");
        } else if (source.equals(view.getBtnback())){
            view.setVisible(false);
            new Logincontroller();
            view.dispose();
        }
    }
    
}
