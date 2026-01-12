package com.arthur.venue_api.DTO.Calendario;

import com.arthur.venue_api.Enum.StatusDiaEnum;

import java.time.LocalDate;
import java.util.List;

public record DiaCalendarioDTO(
        LocalDate data,
        StatusDiaEnum status,
        List<DisponibilidadeCalendarioDTO>disponibilidades
) { }
