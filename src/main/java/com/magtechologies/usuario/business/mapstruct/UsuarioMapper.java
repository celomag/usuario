package com.magtechologies.usuario.business.mapstruct;

import com.magtechologies.usuario.business.dto.UsuarioRequestDTO;
import com.magtechologies.usuario.business.dto.UsuarioResponseDTO;
import com.magtechologies.usuario.infastructure.entities.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO usuarioRequestDTO);

    UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioEntity usuarioEntity);

    List<UsuarioResponseDTO> paraListaUsuarioResponseDTO(List<UsuarioEntity> usuarioEntityList);
}
