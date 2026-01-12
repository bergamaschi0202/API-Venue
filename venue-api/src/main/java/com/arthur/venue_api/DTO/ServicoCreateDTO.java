package com.arthur.venue_api.DTO;

import com.arthur.venue_api.Entity.Local;
import com.arthur.venue_api.Enum.TipoServicoEnum;

import java.math.BigDecimal;

public record ServicoCreateDTO(
        TipoServicoEnum tipoServico,
        String nome,
        String descricao,
        String foto,
        BigDecimal preco
) { }
