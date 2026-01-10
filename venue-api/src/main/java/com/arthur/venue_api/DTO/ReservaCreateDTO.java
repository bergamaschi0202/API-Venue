package com.arthur.venue_api.DTO;

import com.arthur.venue_api.Entity.Local;
import com.arthur.venue_api.Enum.TipoReservaEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record ReservaCreateDTO(
        Local local,
        TipoReservaEnum tipoReserva,
        LocalTime horarioInicio,
        LocalTime horarioTermino,
        LocalDate data,
        BigDecimal preco
) { }
