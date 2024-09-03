package pe.edu.upc.studywinproyect.serviceInterfaces;

import pe.edu.upc.studywinproyect.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    //Como programador quiero listar los usuarios para gestionarlos
    public List<Usuario> list();
    //Como programador quiero guardar a los usuarios para gestionarlos
    public void insert(Usuario usuario);
    //Como programador quiero listar por id a los usuarios
    public Usuario listID(int id);
    //Como progrmador quiero modificar a los usuarios para gestionarlos
    public void update(Usuario usuario);
    //Como programador quiero eliminar a los usuarios para gestionarlos
    public void delete(int id);
    //Como usuario quiero buscar por nombre a los usuarios para gestionarlo
    public List<Usuario> buscar(String nombre, String apellidos);
}
