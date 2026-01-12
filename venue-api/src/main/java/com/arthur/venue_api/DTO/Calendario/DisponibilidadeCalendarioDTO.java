package com.arthur.venue_api.DTO.Calendario;

import com.arthur.venue_api.Enum.StatusDisponibilidadeEnum;

import java.time.LocalDate;
import java.time.LocalTime;

public record DisponibilidadeCalendarioDTO(
        LocalDate dataInicio,
        LocalTime horarioInicio,
        LocalDate dataFim,
        LocalTime horarioFim,
        StatusDisponibilidadeEnum status
) { }
