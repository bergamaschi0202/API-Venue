package com.arthur.venue_api.DTO.Chat;

import java.time.LocalDateTime;

public record ListaChatDTO(
        Long idChat,
        Long nomeLocal,
        String nomeContato,
        String fotoContato,
        String ultimaMensagem,
        LocalDateTime dataUltimaMensagem,
        boolean ativo
) {
}
