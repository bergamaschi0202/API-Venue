package com.arthur.venue_api.Entity;

import com.arthur.venue_api.Enum.StatusReservaEnum;
import com.arthur.venue_api.Enum.TipoReservaEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "TBL_RESERVA")
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_local", nullable = false)
    private Local local;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_reserva", nullable = false, length = 10)
    private TipoReservaEnum tipoReserva;

    @Column(name = "horario_inicio", nullable = false)
    private LocalTime horarioInicio;

    @Column(name = "horario_termino", nullable = false)
    private LocalTime  horarioTermino;

    @Column(name = "data_reserva", nullable = false)
    private LocalDate data;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_reserva", nullable = false, length = 30)
    private StatusReservaEnum statusReserva;

}
