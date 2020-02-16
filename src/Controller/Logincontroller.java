/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.Main;
import View.Loginadmin;
//import View.ViewTiket;
//import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Logincontroller implements ActionListener {
    private Main model;
    private Loginadmin view;
    private Database db = new Database();

    public Logincontroller() {
        model = new Main();
        view = new Loginadmin();
        view.setVisible(true);
        view.addActionListener(this);
        db.connect();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(view.getBtnlogin())){
                if (view.getTfusername().getText().equals("")||view.getTfpassword().getText().equals("")){
                    JOptionPane.showMessageDialog(view, "All data must be field");
                } else {
                    String username=view.getTfusername().getText();
                    String password=view.getTfpassword().getText();
                    if(model.loginAdmin(username,password)){
                        view.setVisible(false);
                        new ControllerTiket();
                        view.dispose();
                    } else {
                        JOptionPane.showMessageDialog(view, "Invalid Password/Username");
                    }
                    view.setTfusername("");
                    view.setTfpassword("");
                }
//                if (model.loginAdmin(view.gettfUsername().getText(), view.gettfPass().getText())){
//                    new Main();
//                }
//                } else {
//                    JOptionPane.showMessageDialog(null, "Gagal Login", "Gagal Login", JOptionPane.ERROR_MESSAGE);
//                }
            } else if (source.equals(view.getBtnsignin())){
                view.setVisible(false);
                new Registercontroller();
                view.dispose();
            } else if (source.equals(view.getBtnforget())){
                view.setVisible(false);
                new Forgetpasscontroller();
                view.dispose();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }
    
}
