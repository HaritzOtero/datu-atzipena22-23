package dambi;

import java.util.ArrayList;

public class Mendiak {
    
    private String izena;
    private int altuera;
    private String probintzia;

    public Mendiak(String izena, int altuera,String probintzia){
        this.altuera = altuera;
        this.izena = izena;
        this.probintzia = probintzia;
    }

    public void setIzena(String nombre) {
        this.izena = izena;
    }

    public void setAltuera(int nombre) {
        this.altuera = altuera;
    }

    public void setProbintzia(String nombre) {
        this.probintzia = probintzia;
    }

    public String getIzena(){
        return izena;
    }

    public int getAltuera(){
        return altuera;
    }

    public String getProbintzia(){
        return probintzia;
    }
}
