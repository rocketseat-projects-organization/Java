package org.example;

import org.example.client.SimpleHTTPClient;
import org.example.dtos.GetRequest;
import java.io.IOException;
import java.net.URISyntaxException;

public class PostJsonExample {
    public static void main(String[] args) {
        try {
            GetRequest postRequest = new GetRequest("Cavaleiros Templarios",
                    "Aprenda sobre os cavaleiros templarios dos Zodiacos",
                    10);

            String postResponse = SimpleHTTPClient.post("https://jsonplaceholder.typicode.com/posts", postRequest);
            System.out.println("postResponse: " + postResponse);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException((e));
        }
    }
}