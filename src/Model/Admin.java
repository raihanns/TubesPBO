package Model;

public class Admin  {
    private  String username;
    private String password;
    private String nik;
    private String name;
    private String newpass;

    public String getNewpass() {
        return newpass;
    }

    public void setNewpass(String newpass) {
        this.newpass = newpass;
    }
    
    public Admin() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public Admin(String username, String password, String nik, String name) {
        this.username = username;
        this.password = password;
        this.nik = nik;
        this.name = name;
        
    }
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
}
