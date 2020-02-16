/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.ViewTiket;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ControllerTiket extends MouseAdapter implements ActionListener {
    
    private ViewTiket view;
    private Database db;

    
    public ControllerTiket() {
        view = new ViewTiket();
        db = new Database();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        loadTable();
    }
    
    public void loadTable(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nama", "Film", "Studio","Kursi","Tanggal Penayangan"}, 0);
        ArrayList<Tiket> tiket = db.getTiket();
        for (Tiket t : tiket) {
            model.addRow(new Object[]{t.getId(), t.getNama(), t.getFilm(), t.getStudio(),t.getKursi(),t.getTanggal()});
        }
        view.setTbTiket(model);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnTambah())){
            btnTambahActionPerformed();
            loadTable();
        }else if (source.equals(view.getBtnHapus())){
            btnHapusActionPerformed();
            loadTable();
        }else if (source.equals(view.getBtnUbah())){
            btnUbahActionPerformed();
            loadTable();
        }else if (source.equals(view.getBtnReset())){
            view.reset();
            loadTable();
        }else if (source.equals(view.getBtnCari())){
            btnCariActionPerformed();
        }
    }
    
    public void btnTambahActionPerformed(){
        String id = view.getID();
        String nama = view.getNama();
        String film = view.getFilm();
        char studio = view.getStudio();
        String kursi = view.getKursi();
        String tanggal = view.getTanggal();
        if (id.isEmpty() || nama.isEmpty() || film.isEmpty() || studio==' ' || kursi.isEmpty() || tanggal.isEmpty()){
            view.showMessage("Data Kosong", "Error", 0);
        }else{
            if (db.cekDuplikatID(id)){
                view.showMessage("ID Sudah Ada", "Error", 0);
            }else{
                db.addTiket(new Tiket(id,nama,film,studio,kursi,tanggal));
                view.reset();
                view.showMessage("Data Berhasil Ditambah", "Success", 1);
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getTbTiket())){
            int i = view.getSelectedTiket();
            String id = view.getTbTiket().getModel().getValueAt(i, 0).toString();
            String nama = view.getTbTiket().getModel().getValueAt(i, 1).toString();
            String film = view.getTbTiket().getModel().getValueAt(i, 2).toString();
            char studio = view.getTbTiket().getModel().getValueAt(i, 3).toString().charAt(0);
            String kursi = view.getTbTiket().getModel().getValueAt(i, 4).toString();
            String tanggal = view.getTbTiket().getModel().getValueAt(i, 5).toString();
            
            view.setID(id);
            view.setNama(nama);
            view.setFilm(film);
            view.setStudio(studio);
            view.setKursi(kursi);
            view.setTanggal(tanggal);
        }
    }
    
    public void btnHapusActionPerformed(){
        String id = view.getID();
        db.delTiket(id);
        view.reset();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
    }
    
    public void btnUbahActionPerformed(){
        String id = view.getID();
        String nama = view.getNama();
        String film = view.getFilm();
        char studio = view.getStudio();
        String kursi = view.getKursi();
        String tanggal = view.getTanggal();
        if (id.isEmpty() || nama.isEmpty() || film.isEmpty() || studio==' ' || kursi.isEmpty() || tanggal.isEmpty()){
            view.showMessage("Data Kosong", "Error", 0);
        }else{
            if (!db.cekDuplikatID(id)){
                view.showMessage("NIM Tidak Ditemukan", "Error", 0);
            }else{
                db.updateTiket(new Tiket(id,nama,film,studio,kursi,tanggal));
                view.reset();
                view.showMessage("Data Berhasil Diubah", "Success", 1);
            }
        }
    }
    
    public void btnCariActionPerformed(){
        String cari = view.getCari();
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nama", "Film", "Studio","Kursi","Tanggal"}, 0);
        ArrayList<Tiket> tiket = db.getTiket();
        for (Tiket t : tiket) {
            if (t.getId().contains(cari) || t.getNama().contains(cari) || t.getFilm().contains(cari)){
                model.addRow(new Object[]{t.getId(), t.getNama(), t.getFilm(), t.getStudio(),t.getKursi(),t.getTanggal()});
            }
        }
        view.setTbTiket(model);
    }
    
}
