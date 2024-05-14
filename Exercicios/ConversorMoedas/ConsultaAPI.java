package ConversorMoedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public DadosAPI converteMoedas(String moeda, String moedaConvertida) {
        URI link = URI.create("https://v6.exchangerate-api.com/v6/b147c45971c45b829e4c659b/latest/" + moeda + "/" + moedaConvertida);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DadosAPI.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível converter a moeda desejada");
        }
    }
}
