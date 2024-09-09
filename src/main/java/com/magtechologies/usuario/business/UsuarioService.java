package com.magtechologies.usuario.business;

import com.magtechologies.usuario.business.dto.UsuarioRequestDTO;
import com.magtechologies.usuario.business.dto.UsuarioResponseDTO;
import com.magtechologies.usuario.business.mapstruct.UsuarioMapper;
import com.magtechologies.usuario.infastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioResponseDTO salvarUsuario(UsuarioRequestDTO request){
        return mapper.paraUsuarioResponseDTO(
                repository.save(
                        mapper.paraUsuarioEntity(request)));
    }

    public List<UsuarioResponseDTO> buscaTodosUsuarios(){
        return mapper.paraListaUsuarioResponseDTO(
                repository.findAll()
        );
    }
    public UsuarioResponseDTO buscaUsuarioPorEmail(String email){
        return mapper.paraUsuarioResponseDTO(
                repository.findByEmail(email)
        );
    }

    public void removerUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }

}
