package org.example.dtos;

public record GetRequest(
        String title,
        String body,
        int userId
) {
}
