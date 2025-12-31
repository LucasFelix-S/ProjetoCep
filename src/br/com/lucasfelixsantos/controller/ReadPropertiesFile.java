package br.com.lucasfelixsantos.controller;
import br.com.lucasfelixsantos.model.DataBasePojo;
import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadPropertiesFile {
    public static DataBasePojo readinPropertiesFile() {
        try{
            String jsonFile = Files.readString(Path.of("properties.json"));
            Gson gson = new Gson();
            return gson.fromJson(jsonFile, DataBasePojo.class);
        } catch(Exception e) {
            System.err.println("Error -> " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}