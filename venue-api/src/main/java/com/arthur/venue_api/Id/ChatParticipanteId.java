package com.arthur.venue_api.Id;

import com.arthur.venue_api.Entity.Chat;
import com.arthur.venue_api.Entity.Usuario;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;

@Embeddable
@Data
public class ChatParticipanteId {

    @JoinColumn(name = "id_chat")
    private Chat chat;

    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
