package com.arthur.venue_api.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_AVALIACAO",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id_usuario", "id_local"})}
)
@Data
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nota", nullable = false)
    private int nota;

    @Lob
    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Local local;

}
