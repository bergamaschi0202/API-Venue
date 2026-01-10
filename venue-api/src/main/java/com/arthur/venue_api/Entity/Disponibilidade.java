package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.StatusDisponibilidadeEnum;
import com.arthur.venue_api.Enum.StatusReservaEnum;
import com.arthur.venue_api.Enum.TipoRepeticaoEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "TBL_DISPONIBILIDADE")
@Data
public class Disponibilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Local local;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "horario_inicio", nullable = false)
    private LocalTime horarioInicio;

    @Column(name = "data_fim", nullable = false)
    private LocalDate dataFim;

    @Column(name = "horario_fim", nullable = false)
    private LocalTime horarioFim;

    @Column(name = "tipo_repeticao", nullable = false)
    private TipoRepeticaoEnum tipoRepeticao;

    @Column(name = "dia_semana")
    private int diaSemana;

    @Column(name = "dia_mes")
    private int diaMes;

    @Column(name = "ordem_semana_mes")
    private int ordemSemanaMes;

    @Column(name = "validade_repeticao", nullable = false)
    private LocalDate validadeRepeticao;

    @Column(name = "ativo", nullable = false)
    private boolean ativo;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_disponibilidade", nullable = false, length = 30)
    private StatusDisponibilidadeEnum statusDisponibilidade;

    @CreationTimestamp
    @Column(name = "data_criacao", updatable = false)
    private LocalDateTime dataCriacao;

}
