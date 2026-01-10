package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.TipoServicoEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TBL_SERVICO")
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Local local;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_servico", length = 50)
    private TipoServicoEnum tipoServico;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Lob
    @Column(name = "descricao")
    private String descricao;

    @Column(name = "foto", length = 255)
    private String foto;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

}
