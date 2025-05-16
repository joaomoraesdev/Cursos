package dio.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.Usuario;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        //repository.save(inserirUsuario("ronaldo", "userR7", "senhamaster"));
        //List<Usuario> listaUsuario = repository.filtrarPorNome("joao");
        List<Usuario> listaUsuario = repository.findAll();
        for(Usuario u: listaUsuario) {
            System.out.println(u);
        }
    }

    private Usuario inserirUsuario(String nome, String usuario, String senha) {
        Usuario user = new Usuario();
        user.setName(nome);
        user.setUsername(usuario);
        user.setPassword(senha);
        return user;
    }
    
}
