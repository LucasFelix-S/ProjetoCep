package br.com.lucasfelixsantos.api;
import br.com.lucasfelixsantos.databse.DataBaseInsert;
import br.com.lucasfelixsantos.model.CepPojo;
import com.google.gson.Gson;

public class ModelaJson {
    public void modelandoJson(String cep) {
        ConectaApi conectaApi = new ConectaApi(cep);
        Gson gson = new Gson();
        CepPojo pojoCep = gson.fromJson(conectaApi.ConexaoViaCep(), CepPojo.class);

        if((pojoCep.logradouro == null || pojoCep.logradouro.isBlank())
                || (pojoCep.bairro == null || pojoCep.bairro.isBlank())) {
            pojoCep.setLogradouro("vazio");
            pojoCep.setBairro("vazio");
        }
        DataBaseInsert armazenaBanco = new DataBaseInsert();
        armazenaBanco.insertBanco(pojoCep);
    }
}