package com.arthur.venue_api.DTO.Usuario;

public record UsuarioCreateDTO(
        String nome,
        String username,
        String telefone,
        String email,
        String senha,
        String foto,
        String cep,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cidade,
        String estado
) { }
