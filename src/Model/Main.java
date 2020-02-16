package Model;

import Model.Database;


public class Main {
    private Database db;
    
    public Main() {
        this.db = new Database();
        db.connect();
    }
    public boolean loginAdmin(String username, String password){
        Admin a = new Admin(username, password);
        if (db.loginAdmin(a)){
            return true;
        } else {
            return false;
        }
    }
    public Admin searchNik(String nik) {
        Admin a = db.getNik(nik);
        if (a!=null){
           return a;
        }
        else {
            return null;
        }
    }
    public void updateAdmin(Admin a){
        db.updateAdmin(a.getNik(), a.getPassword());
    }
    
    public void createAdmin(Admin a){
        db.signUpAdmin(a);
    }
}
