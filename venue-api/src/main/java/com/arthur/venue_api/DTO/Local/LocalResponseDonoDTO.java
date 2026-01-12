package com.arthur.venue_api.DTO.Local;

import com.arthur.venue_api.Entity.Avaliacao;
import com.arthur.venue_api.Entity.FotoFeed;
import com.arthur.venue_api.Entity.Servico;
import com.arthur.venue_api.Entity.Usuario;
import com.arthur.venue_api.Enum.CategoriaEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record LocalResponseDonoDTO(
        String nome,
        String descricao,
        CategoriaEnum categoria,
        String fotoLocal,
        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String estado,
        int capacidade,
        LocalDateTime dataCadastro,
        boolean ativo,
        BigDecimal notaMedia,
        List<FotoFeed> fotosFeed,
        List<Servico> servicos,
        List<Avaliacao> avaliacoes
) { }
