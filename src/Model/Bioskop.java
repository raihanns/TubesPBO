/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
public class Bioskop {
    private String film;
    private char studio;
    private String kursi;

    public Bioskop(){
        
    };
    public Bioskop(String film, char studio, String kursi) {
        this.film = film;
        this.studio = studio;
        this.kursi = kursi;
    }
    public String getKursi(){
        return kursi;
    }
    public void setKursi(String kursi){
        this.kursi = kursi;
    }
    
    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public char getStudio() {
        return studio;
    }

    public void setStudio(char studio) {
        this.studio = studio;
    }
}
