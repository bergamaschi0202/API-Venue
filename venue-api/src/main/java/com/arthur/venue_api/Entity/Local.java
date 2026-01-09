package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.Categoria;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_LOCAL")
@Data
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "descricao", nullable = false, length = 500)
    private String descricao;

    @Column(name = "categoria", nullable = false, length = 500)
    private Categoria categoria;

    @Column(name = "foto_local", length = 255)
    private String foto_local;

    // Endereço
    @Column(name = "cep", nullable = false, length = 10)
    private String cep;

    @Column(name = "logradouro", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "complemento", nullable = false, length = 50)
    private String complemento;

    @Column(name = "bairro", nullable = false, length = 50)
    private String bairro;

    @Column(name = "cidade", nullable = false, length = 50)
    private String cidade;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    // outros atributos
    @Column(name = "capacidade_maxima", nullable = false)
    private int capacidade;

    @OneToOne
    @JoinColumn(name = "id_usuario_dono", nullable = false)
    private Usuario id_dono;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime data_cadastro;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @Column(name = "nota_media", nullable = false)
    private int nota_media;

}
