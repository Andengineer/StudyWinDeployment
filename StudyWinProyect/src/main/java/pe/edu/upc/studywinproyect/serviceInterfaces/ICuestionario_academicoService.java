package pe.edu.upc.studywinproyect.serviceInterfaces;

import pe.edu.upc.studywinproyect.entities.Cuestionario_academico;

import java.util.List;

public interface ICuestionario_academicoService {
    // Como programador quiero listar todos los cuestionarios academicos
    public List<Cuestionario_academico> list();

    // Como programador quiero insertar un nuevo cuestionario academicos
    public void insert(Cuestionario_academico cuestionario_academico);

    // Como programador quiero actualizar un cuestionarios academicos
    public void update(Cuestionario_academico cuestionario_academico);

    // Como programador quiero eliminar un cuestionarios academicos
    public void delete(int id);
    //Como usuario quiero listar los canjes por usuario para gestionarlos
    public List<String[]> cuestionario_academicoxcurso();
}