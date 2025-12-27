package br.com.lucasfelixsantos.databse;
import br.com.lucasfelixsantos.model.CepPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseInsert {
    public void dataBaseInsert(CepPojo pojoCep) {
        DataBaseManager dataBaseManager = new DataBaseManager();
        String insert = "INSERT INTO tbCep(logradouro, bairro, localidade, uf, ddd) VALUES(?, ?, ?, ?, ?)";

        try{
            Connection connection = dataBaseManager.dbConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            preparedStatement.setString(1, pojoCep.getLogradouro());
            preparedStatement.setString(2, pojoCep.getBairro());
            preparedStatement.setString(3, pojoCep.getLocalidade());
            preparedStatement.setString(4, pojoCep.getUf());
            preparedStatement.setString(5, pojoCep.getDdd());
            preparedStatement.addBatch();

            preparedStatement.executeBatch();
            System.out.println("Insertion successful!");
        } catch(SQLException e) {
            System.err.println("Error inserting into the database: " + e.getMessage());
        }
    }
}