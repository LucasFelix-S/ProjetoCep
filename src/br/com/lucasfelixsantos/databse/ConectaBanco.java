package br.com.lucasfelixsantos.databse;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBanco {

    public Connection conexao() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=LojaCompleta;encrypt=false";
        String user = "sa";
        String password = "!#Y1e3xbf4";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!");
            return connection;
        }catch(Exception e) {
            System.out.println("Erro de conexão com o banco de dados: " + e);
        }
        return null;
    }
}