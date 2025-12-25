package br.com.lucasfelixsantos.databse;
import br.com.lucasfelixsantos.model.CepPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataBaseInsert {
    public void insertBanco(CepPojo pojoCep) {
        DataBaseManager conectaBanco = new DataBaseManager();
        String insert = "INSERT INTO tbCep(logradouro, bairro, localidade, uf, ddd) VALUES(?, ?, ?, ?, ?)";

        try{
            Connection connection = conectaBanco.conexao();
            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            preparedStatement.setString(1, pojoCep.getLogradouro());
            preparedStatement.setString(2, pojoCep.getBairro());
            preparedStatement.setString(3, pojoCep.getLocalidade());
            preparedStatement.setString(4, pojoCep.getUf());
            preparedStatement.setString(5, pojoCep.getDdd());
            preparedStatement.addBatch();

            preparedStatement.executeBatch();
            System.out.println("Inserção ocorrida com sucesso!");
        } catch(Exception e) {
            System.out.println("Erro de inserção no Banco de Dados: " + e );
        }
    }
}