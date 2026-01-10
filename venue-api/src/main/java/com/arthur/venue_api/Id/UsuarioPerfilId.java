package com.arthur.venue_api.Id;

import com.arthur.venue_api.Enum.PerfilEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class UsuarioPerfilId implements Serializable {

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil", length = 20)
    private PerfilEnum perfil;

}
