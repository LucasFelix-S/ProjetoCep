package br.com.lucasfelixsantos.app;
import br.com.lucasfelixsantos.api.JsonModeller;

public class App {
    public static void main(String args[]) {
        JsonModeller jsonModeller = new JsonModeller();
        jsonModeller.jsonModel("37120000");
    }
}