package com.arthur.venue_api.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_USUARIO")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "username")
    private String username;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

}
