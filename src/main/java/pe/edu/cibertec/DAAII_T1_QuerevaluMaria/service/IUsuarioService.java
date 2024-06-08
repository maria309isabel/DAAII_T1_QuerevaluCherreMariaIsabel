package pe.edu.cibertec.DAAII_T1_QuerevaluMaria.service;

import pe.edu.cibertec.DAAII_T1_QuerevaluMaria.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
        Usuario buscarUsuarioXNomUsuario(String nomusuario);
        Usuario guardarUsuario(Usuario usuario);
        void actualizarUsuario(Usuario usuario);
        List<Usuario> listarUsuario();
        Usuario buscarUsuarioXIdUsuario(Integer idusuario);
}
