package br.com.lucasfelixsantos.database;
import br.com.lucasfelixsantos.controller.ReadPropertiesFile;
import br.com.lucasfelixsantos.model.DataBasePojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
    private DataBasePojo dataBasePojo;

    public Connection dbConnection() {
        dataBasePojo = ReadPropertiesFile.readinPropertiesFile();
        try{
            Connection connection = DriverManager.getConnection(dataBasePojo.getDataBaseUrl(),
                    dataBasePojo.getDataBaseUser(), dataBasePojo.getDataBasePassword());
            System.out.println("Connection successfully established!");
            return connection;
        }catch(NullPointerException | SQLException e) {
            System.err.println("Database connection error:" + e.getMessage());
        }
        return null;
    }
}