package com.arthur.venue_api.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class UsuarioPerfilId implements Serializable {

    @EmbeddedId
    private UsuarioPerfilId id;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "perfil")
    private String perfil;
}
