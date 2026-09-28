package com.uniceplac.atividademvcdto.controller;

import com.uniceplac.atividademvcdto.dto.UsuarioCadastroDTO;
import com.uniceplac.atividademvcdto.model.Usuario;
import com.uniceplac.atividademvcdto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public Usuario criarUsuario(@RequestBody UsuarioCadastroDTO dto) {
        Usuario usuario = new Usuario();

        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.setAdmin(false);

        return repository.save(usuario);
    }
}
