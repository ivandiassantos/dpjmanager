package la.foton.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.ProjetoDAO;
import la.foton.dpjmanager.entidades.Projeto;
import la.foton.dpjmanager.service.ProjetoService;

@Service("projetoService")
public class ProjetoServiceImpl implements ProjetoService {
	@Autowired
	private ProjetoDAO projetoDAO;

	@Override
	public List<Projeto> listaPorCliente(Long codCliente)
	{
	   return projetoDAO.listaPorCliente(codCliente);
	}
}
