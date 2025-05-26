package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/users")
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") int id) {
        usuarioRepository.deleteById(id);
    }

    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
