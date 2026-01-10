package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.PerfilEnum;
import com.arthur.venue_api.Id.UsuarioPerfilId;
import jakarta.persistence.*;
import lombok.Data;

@Embeddable
@Table(name = "TBL_USUARIO_PERFIL")
@Data
public class UsuarioPerfil {

    @EmbeddedId
    private UsuarioPerfilId id;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil", length = 20)
    private PerfilEnum perfil;

    public PerfilEnum getPerfil() {
        return perfil;
    }

}
