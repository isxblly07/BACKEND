package com.timeright.tcc.controller;

import com.timeright.tcc.model.entity.Usuario;
import com.timeright.tcc.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
        @RequestMapping("/api/usuario")
        @CrossOrigin(origins = {"http://localhost:5173"})
        public class UsuarioController {

            private final UsuarioService usuarioService;

            public UsuarioController(UsuarioService usuarioService){ this.usuarioService = usuarioService; }

            @GetMapping
            public List<Usuario> listar() {
                List<Usuario> l = usuarioService.listarTodos();
                //l.forEach(u -> u.setSenha(null));
                return l;
            }

            @PutMapping("/{id}")
            public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Usuario u) {
                try {
                    Usuario updated = usuarioService.atualizar(id, u);
                    updated.setSenha(null);
                    return ResponseEntity.ok(updated);
                } catch (Exception ex) {
                    return ResponseEntity.badRequest().body(Map.of("erro", ex.getMessage()));
                }
            }

            @DeleteMapping("/{id}")
            public ResponseEntity<?> deletar(@PathVariable Long id) {
                usuarioService.deletar(id);
                return ResponseEntity.ok(Map.of("msg","Usuário deletado"));
            }
        }



