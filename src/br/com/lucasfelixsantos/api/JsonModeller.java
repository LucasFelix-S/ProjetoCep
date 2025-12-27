package br.com.lucasfelixsantos.api;
import br.com.lucasfelixsantos.databse.DataBaseInsert;
import br.com.lucasfelixsantos.model.CepPojo;
import com.google.gson.Gson;

public class JsonModeller {
    public void jsonModel(String cep) {
        ApiConnect apiConnect = new ApiConnect(cep);
        Gson gson = new Gson();
        CepPojo pojoCep = gson.fromJson(apiConnect.viaCepConnect(), CepPojo.class);

        if((pojoCep.logradouro == null || pojoCep.logradouro.isBlank())
                || (pojoCep.bairro == null || pojoCep.bairro.isBlank())) {
            pojoCep.setLogradouro("sem-logradouro");
            pojoCep.setBairro("sem-bairro");
        }
        DataBaseInsert dataBaseInsert = new DataBaseInsert();
        dataBaseInsert.dataBaseInsert(pojoCep);
    }
}