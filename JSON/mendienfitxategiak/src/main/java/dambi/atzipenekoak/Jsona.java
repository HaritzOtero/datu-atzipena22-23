package dambi.atzipenekoak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.json.JsonStructure;
import javax.json.JsonWriter;

import dambi.pojoak.Mendia;
import dambi.pojoak.Mendiak;

public class Jsona {
    public String strFileIn;
    public String strFileOut;

    public Mendiak mendiakIrakurri(){
        Mendiak mendiak = null;
        try{
            JsonReader reader = Json.createReader(new FileReader(strFileIn));
            JsonStructure jsonst = reader.read();
            JsonArray jsonArray =jsonst.asJsonArray();
            mendiak= new Mendiak();

            for(int i = 0; i < jsonArray.size();i++){
                JsonObject jsonobj = jsonArray.getJsonObject(i);

            }
        }
        return null;
    }

    public Mendiak mendiakIdatzi(Mendiak mendiak) throws FileNotFoundException{
        int mendiKopurua = 0;
        JsonArray model = null;
        JsonArrayBuilder jab = Json.createArrayBuilder();
        for(Mendia m : mendiak.getMendiak()){
            jab.add(Json.createObjectBuilder()
            .add("id", m.getId())
            .add("altuera", m.getAltuera())
            .add("probintzia", m.getProbintzia())
            .build());
            mendiKopurua++;
        }
        model = jab.build();
        try(JsonWriter jsonWriter = Json.createWriter(new FileOutputStream(strFileOut))){}
            
        return mendiak;
        

    }
}
