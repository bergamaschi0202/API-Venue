package com.arthur.venue_api.DTO;

import com.arthur.venue_api.Enum.CategoriaEnum;

public record LocalCreateDTO(
        String nome,
        String descricao,
        CategoriaEnum categoria,
        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String estado,
        int capacidade
) { }
