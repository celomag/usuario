package com.magtechologies.usuario.controller;

import com.magtechologies.usuario.business.UsuarioService;
import com.magtechologies.usuario.business.dto.UsuarioRequestDTO;
import com.magtechologies.usuario.business.dto.UsuarioResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> salvaUsuario(@RequestBody UsuarioRequestDTO dto) {
        return ResponseEntity.ok(service.salvarUsuario(dto));
    }

    @GetMapping("/{email}")
    public ResponseEntity<UsuarioResponseDTO> buscaUsuarioPorEmail(@PathVariable("email") String email) {
        return ResponseEntity.ok(service.buscaUsuarioPorEmail(email));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> buscaTodosUsuarios() {
        return ResponseEntity.ok(service.buscaTodosUsuarios());
    }

    @DeleteMapping
    public ResponseEntity<UsuarioResponseDTO> deletaUsuario(@RequestParam("email") String email) {
        service.removerUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

}