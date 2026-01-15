package com.arthur.venue_api.DTO;

import com.arthur.venue_api.Entity.Local;
import com.arthur.venue_api.Enum.StatusContratoEnum;

import java.time.LocalDate;

public record ContratoResumoDTO(
        StatusContratoEnum statusContrato,
        LocalResumoDTO local,
        LocalDate dataInicioRaserva
) { }
