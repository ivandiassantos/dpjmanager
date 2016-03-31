package la.foton.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.EmpresaDAO;
import la.foton.dpjmanager.entidades.Empresa;
import la.foton.dpjmanager.service.EmpresaService;

@Service("empresaService")
public class EmpresaServiceImpl implements EmpresaService{
	@Autowired
	private EmpresaDAO empresaDAO;
	@Override
	public List<Empresa> listarEmpresas() {
		
		return empresaDAO.listarEmpresa();
	}

}
