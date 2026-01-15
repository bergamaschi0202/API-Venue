package com.arthur.venue_api.Service;

import com.arthur.venue_api.DTO.Usuario.UsuarioCreateDTO;
import com.arthur.venue_api.DTO.Usuario.UsuarioSelfResponseDTO;
import com.arthur.venue_api.Entity.Usuario;
import com.arthur.venue_api.Mapper.UsuarioMapper;
import com.arthur.venue_api.Repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(
            UsuarioRepository usuarioRepository,
            UsuarioMapper usuarioMapper,
            PasswordEncoder passwordEncoder
    ) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public UsuarioSelfResponseDTO createUsuario(UsuarioCreateDTO dto){

        Usuario usuario = usuarioMapper.toEntity(dto);

        usuario.setSenha(passwordEncoder.encode(dto.senha()));
        usuario.setDataCadastro(LocalDateTime.now());

        usuarioRepository.save(usuario);

        return usuarioMapper.toSelfResponseDTO(usuario);
    }
}
