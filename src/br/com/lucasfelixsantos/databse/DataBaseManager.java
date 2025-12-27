package br.com.lucasfelixsantos.databse;
import br.com.lucasfelixsantos.model.DataBasePojo;
import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
    public Connection dbConnection() {
        Connection connection = null;
        try{
            String jsonFile = Files.readString(Paths.get("properties.json"));
            Gson gson = new Gson();
            DataBasePojo dataBasePojo = gson.fromJson(jsonFile, DataBasePojo.class);

            connection = DriverManager.getConnection(dataBasePojo.getDataBaseUrl(),
                    dataBasePojo.getDataBaseUser(),
                    dataBasePojo.getDataBasePassword());

            System.out.println("Connection successfully established!");
            return connection;
        }catch(IOException |SQLException e) {
            System.err.println("Database connection error:" + e.getMessage());
        }
        return connection;
    }
}