package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin()==null) {
            throw new CampoObrigatorioException("password");
        }
        if(usuario.getPassword()==null) {
            throw new CampoObrigatorioException("login");
        }
        if(usuario.getId() == null){
            System.out.println("Save - Recebendo o usuario na camada de repositorio");
        }
        else {
            System.out.println("Update - Recebendo o usuario na camada de repositorio");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("Delete/id - Recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("List - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("Find/id - Recebendo o id: %d para localizar um usuario", id));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("Find/username - Recebendo o username: %d para localizar um usuario", username));
        return new Usuario("gleyson", "password");
    }
}
