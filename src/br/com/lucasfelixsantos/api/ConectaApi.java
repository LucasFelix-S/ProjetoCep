package br.com.lucasfelixsantos.api;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConectaApi {
    private String cep;
    public ConectaApi(String cep){
        this.cep = cep;
    }

    public String ConexaoViaCep() {
        String endpoint = String.format("https://viacep.com.br/ws/%s/json/", cep);
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest httpResquest = HttpRequest.newBuilder()
                    .uri(new URI(endpoint))
                    .GET()
                    .build();
            HttpResponse<String> httpResponse = httpClient.send(httpResquest, HttpResponse.BodyHandlers.ofString());
            return httpResponse.body();
        } catch(Exception e) {
            System.out.println("Erro de conexão com a API, erro: " + e);
        }
        return null;
    }
}