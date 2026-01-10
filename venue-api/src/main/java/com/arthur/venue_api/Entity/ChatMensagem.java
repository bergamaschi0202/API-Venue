package com.arthur.venue_api.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_CHAT_MENSAGEM")
@Data
public class ChatMensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_chat", nullable = false)
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "id_remetente", nullable = false)
    private Usuario remetente;

    @Lob
    @Column(name = "mensagem", nullable = false)
    private String mensagem;

    @CreationTimestamp
    @Column(name = "data_envio")
    private LocalDateTime dataEnvio;

}
