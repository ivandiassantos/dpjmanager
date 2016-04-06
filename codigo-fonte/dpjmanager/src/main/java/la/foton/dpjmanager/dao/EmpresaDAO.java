package la.foton.dpjmanager.dao;

import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Empresa;

public interface EmpresaDAO extends Dao<Empresa> {
	
	List<Empresa> listarEmpresa();

}
