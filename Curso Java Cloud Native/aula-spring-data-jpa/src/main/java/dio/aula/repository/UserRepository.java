package dio.aula.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.aula.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.name LIKE %:nome%")
    List<Usuario> filtrarPorNome(@Param("nome") String nome);

    @Query("SELECT u FROM Usuario u WHERE u.name LIKE %:nome%")
    List<Usuario> listarTodos(@Param("nome") String nome);

}
