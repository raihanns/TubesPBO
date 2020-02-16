package Controller;

import Model.Database;
import Model.Admin;
import Model.*;
import View.Forgetpass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Forgetpasscontroller implements ActionListener {
    private Main model;
    private Forgetpass view;
    private Database db = new Database();

    public Forgetpasscontroller() {
        model = new Main();
        view = new Forgetpass();
        view.setVisible(true);
        view.addActionListener(this);
        db.connect();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnsubmit())){
            if (view.getTfNik().getText().equals("") ||
                view.getTfpass().getText().equals("") || view.getTfConfirm().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Fill data field first");
            } else {
                String nik = view.getTfNik().getText();
                Admin a = model.searchNik(nik);
                if (model.searchNik(nik) != null){
                    String pass = view.getTfpass().getText();
                    String confirmPass = view.getTfConfirm().getText();
                    if (pass.equals(confirmPass)){
                        a.setPassword(pass);
                        model.updateAdmin(a);
                        JOptionPane.showMessageDialog(view, "Change password succesful");
                    } else {
                        JOptionPane.showMessageDialog(view, "Confirmed password must be same");
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "NIK doesn't exist");
                }
            }
            view.setTfNik("");
            view.setTfpass("");
            view.setTfConfirm("");
        } else if (source.equals(view.getBtnback())){
            new Logincontroller();
            view.dispose();
        }
        
        }
}


