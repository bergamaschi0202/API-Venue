package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Id.ChatParticipanteId;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_CHAT_PARTICIPANTE")
@Data
public class ChatParticipante {

    @EmbeddedId
    private ChatParticipanteId id;

    @ManyToOne
    @MapsId("chatId")
    @JoinColumn(name = "id_chat")
    private Chat chat;

    @ManyToOne
    @MapsId("usuarioId")
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
