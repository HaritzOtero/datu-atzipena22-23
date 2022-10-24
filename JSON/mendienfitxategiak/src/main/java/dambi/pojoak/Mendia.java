package dambi.pojoak;

import jakarta.xml.bind.annotation.XmlElement;

/**
 * Hello world!
 *
 */
public class Mendia 
{
    
    
        private String izena;
        private int altuera;
        private String probintzia;
        private int id = 0;
    
        @XmlElement( name = "Mendia_id" )
        public void setId(int id){
            this.id = id;
        }
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

        public int getId(){
            return id;
        }



    }

