package br.com.lucasfelixsantos.api;
import br.com.lucasfelixsantos.databse.ArmazenaBanco;
import br.com.lucasfelixsantos.model.PojoCep;
import com.google.gson.Gson;

public class ModelaJson {
    public void modelandoJson() {
        ConectaApi conectaApi = new ConectaApi();
        Gson gson = new Gson();
        PojoCep pojoCep = gson.fromJson(conectaApi.ConexaoViaCep(), PojoCep.class);

        if((pojoCep.logradouro == null || pojoCep.logradouro.isBlank())
                || (pojoCep.bairro == null || pojoCep.bairro.isBlank())) {
            pojoCep.setLogradouro("vazio");
            pojoCep.setBairro("vazio");
        }

        ArmazenaBanco armazenaBanco = new ArmazenaBanco();
        armazenaBanco.insertBanco(pojoCep);

    }
}