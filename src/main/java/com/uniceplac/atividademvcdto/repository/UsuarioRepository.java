package com.uniceplac.atividademvcdto.repository;

import com.uniceplac.atividademvcdto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
