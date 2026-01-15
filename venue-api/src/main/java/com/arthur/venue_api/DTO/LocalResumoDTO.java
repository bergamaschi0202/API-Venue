package com.arthur.venue_api.DTO;

import com.arthur.venue_api.Enum.CategoriaEnum;

public record LocalResumoDTO(
        String nome,
        CategoriaEnum categoria
) { }
