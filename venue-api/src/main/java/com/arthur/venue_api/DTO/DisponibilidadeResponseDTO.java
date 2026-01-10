package com.arthur.venue_api.DTO;

import com.arthur.venue_api.Entity.Local;
import com.arthur.venue_api.Enum.StatusDisponibilidadeEnum;
import com.arthur.venue_api.Enum.TipoRepeticaoEnum;

import java.time.LocalDate;
import java.time.LocalTime;

public record DisponibilidadeResponseDTO(
        Local local,
        LocalDate dataInicio,
        LocalTime horarioInicio,
        LocalDate dataFim,
        LocalTime horarioFim,
        StatusDisponibilidadeEnum statusDisponibilidade
) { }
