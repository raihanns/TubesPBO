package Model;

import Model.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Tiket> tiket = new ArrayList<>();

    public Database() {
        loadTiket();
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/bioskop";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadTiket() {
        connect();
        try {
            String query = "SELECT * FROM tiket";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                tiket.add(new Tiket(rs.getString("id"), rs.getString("nama"), rs.getString("film"), rs.getString("studio").charAt(0),rs.getString("kursi"),rs.getString("tanggal")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Tiket> getTiket() {
        return tiket;
    }
    
    public void addTiket(Tiket t) {
        connect();
        String query = "INSERT INTO tiket VALUES (";
        query += "'" + t.getId() + "',";
        query += "'" + t.getNama() + "',";
        query += "'" + t.getFilm() + "',";
        query += "'" + t.getStudio() + "',";
        query += "'" + t.getKursi() + "',";
        query += "'" + t.getTanggal() + "'";
        query += ")";
        if (manipulate(query)) tiket.add(t);
        disconnect();
    }
     
    public boolean cekDuplikatID(String id){
        boolean cek = false;
        for (Tiket tkt : tiket) {
            if (tkt.getId().equals(id)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public void delTiket(String id) {
        connect();
        String query = "DELETE FROM tiket WHERE id='" + id + "'";
        if (manipulate(query)){
            for (Tiket tkt : tiket) {
                if (tkt.getId().equals(id)){
                    tiket.remove(tkt);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void updateTiket(Tiket t) {
        connect();
        String query = "UPDATE tiket SET";
        query += " nama='" + t.getNama() + "',";
        query += " film='" + t.getFilm() + "',";
        query += " studio='" + t.getStudio() + "',";
        query += " kursi='" + t.getKursi() + "',";
        query += " tanggal='" + t.getTanggal() + "'";
        query += " WHERE id='" + t.getId() + "'";
        if (manipulate(query)){
            for (Tiket tkt : tiket) {
                if (tkt.getId().equals(t.getId())){
                    tkt.setNama(t.getNama());
                    tkt.setFilm(t.getFilm());
                    tkt.setStudio(t.getStudio());
                    tkt.setKursi(t.getKursi());
                    tkt.setTanggal(t.getTanggal());
                    break;
                }
            }
        }
        disconnect();
    }
    public boolean loginAdmin(Admin a){
        try {
            String query = "select * from admin where username ='"
                    + a.getUsername() + "' and password = '" + a.getPassword() + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Username or password doesn't exist");
        }
    
    }
    public void signUpAdmin(Admin a) {
        try {
            String query = "insert into admin (username, password, nik, nama) values"
                + "('" + a.getUsername() + "', "
                + "'" + a.getPassword() + "', "
                + "'" + a.getNik() + "', "
                + "'" + a.getName() + "')";
            stmt.executeUpdate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("NIK doesn't exist");
        }
    }
     public Admin getNik(String nik){
        try {
            Admin a = null;
            String query = "select * from admin where nik = '" + nik + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()){
                a = new Admin(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
           return a;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Problem while getting data");
        }
     
    }
     public void updateAdmin(String nik, String password){
        try {
            String query = "update admin set password = '" + password +
                "' where nik = '" + nik + "'";
            stmt.executeUpdate(query);
        } catch (Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("Problem while updating data");
        }
    }
}