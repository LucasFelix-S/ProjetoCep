package br.com.lucasfelixsantos.model;
import br.com.lucasfelixsantos.databse.DataBaseConnection;
import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadDataBasePropertiesFile {
    public void readProperties() {
        try{
            String jsonFile = Files.readString(Paths.get("properties.json"));
            Gson gson = new Gson();
            DataBasePojo dataBasePojo = gson.fromJson(jsonFile, DataBasePojo.class);
            DataBaseConnection dataBaseConnection = new DataBaseConnection();
            dataBaseConnection.conexao(dataBasePojo);
        } catch (Exception e) {
            System.out.println("Error while reading the properties.json file: " + e.getMessage());
        }
    }
}