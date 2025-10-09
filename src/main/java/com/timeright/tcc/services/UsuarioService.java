package com.timeright.tcc.services;

import com.timeright.tcc.model.entity.Usuario;
import com.timeright.tcc.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

    @Service
    public class UsuarioService {

        @Autowired  // Injeção de dependência automática
        private UsuarioRepository usuarioRepository;


        // Método responsável em listar todos os serviços cadastrados no banco de dados

        public List<Usuario> findAll() {
            return usuarioRepository.findAll();
        }

        // Método responsável em CRIAR o SERVIÇO no banco de dados

        public Usuario salvarUsuario(@RequestBody Usuario usuario) {
            usuario.setCodStatus("ATIVO");
            return usuarioRepository.save(usuario);
        }


        public List<Usuario> listarTodos() {
            return usuarioRepository.findAll();
        }

        public Usuario atualizar(Long id, Usuario u) {
            return null;
        }

        public void deletar(Long id) {
        }
    }


