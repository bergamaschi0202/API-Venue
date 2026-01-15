package com.arthur.venue_api.Mapper;

import com.arthur.venue_api.DTO.Usuario.UsuarioCreateDTO;
import com.arthur.venue_api.DTO.Usuario.UsuarioSelfResponseDTO;
import com.arthur.venue_api.DTO.Usuario.UsuarioUpdateDTO;
import com.arthur.venue_api.Entity.Usuario;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "senha", ignore = true)
    @Mapping(target = "dataCadastro", ignore = true)
    @Mapping(target = "perfis", ignore = true)
    @Mapping(target = "contratos", ignore = true)
    Usuario toEntity(UsuarioCreateDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDTO(UsuarioUpdateDTO dto, @MappingTarget Usuario entity);

    UsuarioSelfResponseDTO toSelfResponseDTO(Usuario usuario);

}
