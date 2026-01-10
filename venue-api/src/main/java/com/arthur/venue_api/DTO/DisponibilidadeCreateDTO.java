package com.arthur.venue_api.DTO;

import com.arthur.venue_api.Entity.Local;
import com.arthur.venue_api.Enum.TipoRepeticaoEnum;

import java.time.LocalDate;
import java.time.LocalTime;

public record DisponibilidadeCreateDTO(
        Local local,
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
