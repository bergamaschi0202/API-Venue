package com.arthur.venue_api.Id;

import com.arthur.venue_api.Entity.Chat;
import com.arthur.venue_api.Entity.Usuario;
import jakarta.persistence.*;
import lombok.Data;

@Embeddable
@Data
public class ChatParticipanteId {

    @Column(name = "id_chat")
    private Chat chat;

    @Column(name = "id_usuario")
    private Usuario usuario;

}
