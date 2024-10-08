package com.magtechologies.usuario.infastructure.repository;

import com.magtechologies.usuario.infastructure.entities.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity , Long> {

    UsuarioEntity findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
