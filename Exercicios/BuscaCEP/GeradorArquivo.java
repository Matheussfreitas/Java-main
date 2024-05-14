package BuscaCEP;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {
    public void gerarArquivo(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter gravarArquivo = new FileWriter("cep.json");
        gravarArquivo.write(gson.toJson(endereco));
        gravarArquivo.close();
    }
}
