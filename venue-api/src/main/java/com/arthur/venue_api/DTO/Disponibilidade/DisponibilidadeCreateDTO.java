package com.arthur.venue_api.DTO.Disponibilidade;

import com.arthur.venue_api.Enum.TipoRepeticaoEnum;

import java.time.LocalDate;
import java.time.LocalTime;

public record DisponibilidadeCreateDTO(
        LocalDate dataInicio,
        LocalTime horarioInicio,
        LocalDate dataFim,
        LocalTime horarioFim,
        TipoRepeticaoEnum tipoRepeticao,
        int diaSemana,
        int diaMes,
        int ordemSemanaMes,
        LocalDate validadeRepeticao
) { }
