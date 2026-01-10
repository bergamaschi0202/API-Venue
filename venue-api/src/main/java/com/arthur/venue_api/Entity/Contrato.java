package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.StatusContratoEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TBL_CONTRATO")
@Data
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_contrato", nullable = false, length = 30)
    private StatusContratoEnum statusContrato;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Usuario cliente;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Local local;

    @OneToOne
    @JoinColumn(name = "id_reserva", nullable = false)
    private Reserva reserva;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @ManyToMany
    @JoinTable(
            name = "TBL_CONTRATO_SERVICO",
            joinColumns = @JoinColumn(name = "id_contrato"),
            inverseJoinColumns = @JoinColumn(name = "id_servico")
    )
    private List<Servico> servicos;
}
