package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.CategoriaEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TBL_LOCAL")
@Data
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", unique = true, nullable = false, length = 100)
    private String nome;

    @Lob
    @Column(name = "descricao")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", nullable = false, length = 50)
    private CategoriaEnum categoria;

    @Column(name = "foto_local", length = 255)
    private String fotoLocal;

    // Endereço
    @Column(name = "cep", nullable = false, length = 10)
    private String cep;

    @Column(name = "logradouro", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "complemento", length = 50)
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

    @ManyToOne
    @JoinColumn(name = "id_usuario_dono", nullable = false)
    private Usuario dono;

    @CreationTimestamp
    @Column(name = "data_cadastro", updatable = false)
    private LocalDateTime dataCadastro;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @Column(name = "nota_media", nullable = false)
    private BigDecimal notaMedia;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FotoFeed> fotosFeed;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Servico> servicos;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Avaliacao> avaliacoes;

}
