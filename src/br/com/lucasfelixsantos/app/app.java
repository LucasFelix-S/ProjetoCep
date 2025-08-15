package br.com.lucasfelixsantos.app;
import br.com.lucasfelixsantos.api.ModelaJson;

public class app {
    public static void main(String args[]) {
        ModelaJson modelaJson = new ModelaJson();
        String cep = "37120000";
        if(args.lenght() > 0) {
            cep = args[0];
        }
        modelaJson.modelandoJson(cep);
    }
}
