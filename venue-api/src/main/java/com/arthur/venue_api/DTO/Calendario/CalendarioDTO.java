package com.arthur.venue_api.DTO.Calendario;

import java.time.LocalDate;
import java.util.List;

public record CalendarioDTO(
        Long idLocal,
        LocalDate inicio,
        LocalDate fim,
        List<DiaCalendarioDTO> dias
) { }
