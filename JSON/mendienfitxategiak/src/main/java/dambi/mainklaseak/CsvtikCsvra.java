package dambi.mainklaseak;

import java.io.IOException;

import dambi.atzipenekoak.Csva;
import dambi.pojoak.Mendia;
import dambi.pojoak.Mendiak;

public class CsvtikCsvra {
    public static void main(String[] args)  {
    Mendiak mendiak = new Mendiak();
    Mendiak gipuzkoakoak = new Mendiak();

    Csva csva = new Csva("data/Mendiak.csv","data/Gipuzkoakoak.csv");
    
    mendiak = csva.irakurri();

    if(mendiak != null){
        for(Mendia m : mendiak.getMendiak()){
            if(m.getProbintzia().equals("Gipuzkoa")){
                gipuzkoakoak.add(m);
            }
        }
        System.out.println(csva.idatzi(gipuzkoakoak));
    }
} 
}


