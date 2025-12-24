package br.com.lucasfelixsantos.databse;
import br.com.lucasfelixsantos.model.DataBasePojo;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    public Connection conexao(DataBasePojo dataBasePojo) {
        try{
            Connection connection = DriverManager.getConnection(dataBasePojo.getDataBaseUrl(),
                    dataBasePojo.getDataBaseUrl(),
                    dataBasePojo.getDataBasePassword());
            System.out.println("Conexão realizada com sucesso!");
            return connection;
        }catch(Exception e) {
            System.out.println("Erro de conexão com o banco de dados: " + e);
        }
        return null;
    }
}