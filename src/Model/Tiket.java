/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PC
 */
public class Tiket extends Bioskop {
    private String id;
    private String nama;
    private String tanggal;
    
    public Tiket(String id, String nama, String film, char studio,String kursi, String tanggal) {
        super(film,studio,kursi);
        this.id = id;
        this.nama = nama;
        this.tanggal = tanggal;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
}
