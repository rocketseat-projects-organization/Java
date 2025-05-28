package org.example;

import com.google.gson.Gson;
import org.example.client.SimpleHTTPClient;
import org.example.dtos.GetRequest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class GetJsonExample {
    private static final Gson gson = new Gson();

    public static void main(String[] args) throws IOException, URISyntaxException {
        try {
            String respostaGet = SimpleHTTPClient.get("https://jsonplaceholder.typicode.com/posts/1");
            GetRequest request = gson.fromJson(respostaGet, GetRequest.class);
            System.out.println("GET:\n" + request);

            System.out.println("Titulo: " + request.title());
            System.out.println("Corpo da Requisição: " + request.body());
            System.out.println("Id: " + request.userId());
        } catch (Exception e) {
            throw new RuntimeException((e));
        }
    }
}
