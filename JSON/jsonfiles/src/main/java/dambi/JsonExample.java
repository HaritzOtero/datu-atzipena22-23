package dambi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.json.JsonWriter;

public class JsonExample {
    public static void main(String[] args) {
        JsonObject menu = Json.createObjectBuilder()
    
        .add("id", "file")
        .add("value", "File")
        .add("popup", Json.createObjectBuilder()
            .add("menuitem", Json.createArrayBuilder()
                .add( Json.createObjectBuilder()
                    .add("value", "New")
                    .add("onclick", "CreateNewDoc()"))
                .add( Json.createObjectBuilder()
                    .add("value", "Open")
                    .add("onclick", "OpenDoc()"))
                .add( Json.createObjectBuilder()
                    .add("value", "Close")
                    .add("onclick", "CloseDoc()"))
                
            )
        )

    .build();

    try (JsonWriter jsonWriter = Json.createWriter(new FileOutputStream("datuakJsonExample.json"))) {
        jsonWriter.writeObject(menu);
     }
    

}
