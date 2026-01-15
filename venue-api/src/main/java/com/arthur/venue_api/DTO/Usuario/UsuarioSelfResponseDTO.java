package com.arthur.venue_api.DTO.Usuario;

import com.arthur.venue_api.DTO.ContratoResumoDTO;
import com.arthur.venue_api.Entity.Contrato;
import com.arthur.venue_api.Entity.UsuarioPerfil;

import java.time.LocalDateTime;
import java.util.List;

public record UsuarioSelfResponseDTO(
        String nome,
        String username,
        String telefone,
        String email,
        String foto,
        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String estado,
        List<UsuarioPerfil> perfis,
        List<ContratoResumoDTO> contratos,
        LocalDateTime dataCadastro
) { }
