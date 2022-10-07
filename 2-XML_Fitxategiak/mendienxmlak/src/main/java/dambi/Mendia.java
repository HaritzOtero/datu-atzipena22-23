package dambi;



import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlType( propOrder = { "izena", "altuera", "probintzia"} )

@XmlRootElement( name = "Mendia" )

public class Mendia {
    
    private String izena;
    private int altuera;
    private String probintzia;

    
    @XmlElement( name = "Mendia_izena" )
    public void setIzena(String izena) {
        this.izena = izena;
    }
    @XmlElement( name = "Mendia_altuera" )
    public void setAltuera(int altuera) {
        this.altuera = altuera;
    }
    @XmlElement( name = "Mendia_probintzia" )
    public void setProbintzia(String probintzia) {
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