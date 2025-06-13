package com.aluracursos.conversor.clases;

import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversor {

    public Moneda buscarMonedas (String entrada, String salida, double valor) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/84888a8fc92b0ae4876c3296/pair/"+entrada+"/"+salida+"/"+valor);

        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Moneda.class);
            } catch (IOException e) {
                throw new RuntimeException("No se encontró esa moneda " + e.getMessage());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
