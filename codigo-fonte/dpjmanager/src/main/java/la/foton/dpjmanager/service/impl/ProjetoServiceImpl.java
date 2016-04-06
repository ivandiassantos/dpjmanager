package la.foton.dpjmanager.service.impl;

import java.util.List;

import la.foton.dpjmanager.dao.ProjetoDAO;
import la.foton.dpjmanager.entidades.rhour.Projeto;
import la.foton.dpjmanager.service.ProjetoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
