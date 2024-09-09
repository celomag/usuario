package com.magtechologies.usuario.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDTO {

    @JsonProperty(required = true)
    private String nome;
    @JsonProperty(required = true)
    private String senha;
    @JsonProperty(required = true)
    private String email;
}
