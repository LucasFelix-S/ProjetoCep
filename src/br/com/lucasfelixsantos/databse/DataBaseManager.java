package br.com.lucasfelixsantos.databse;
import br.com.lucasfelixsantos.model.DataBasePojo;
import com.google.gson.Gson;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseManager {
    public Connection conexao() {
        Connection connection = null;
        try{
            String jsonFile = Files.readString(Paths.get("properties.json"));
            Gson gson = new Gson();
            DataBasePojo dataBasePojo = gson.fromJson(jsonFile, DataBasePojo.class);

            connection = DriverManager.getConnection(dataBasePojo.getDataBaseUrl(),
                    dataBasePojo.getDataBaseUser(),
                    dataBasePojo.getDataBasePassword());

            System.out.println("Conexão realizada com sucesso!");
            return connection;
        }catch(Exception e) {
            System.err.println("Erro de conexão com o banco de dados: " + e);
        }
        return connection;
    }
}