package la.foton.dpjmanager.service.impl;

import java.util.List;

import la.foton.dpjmanager.dao.AtividadeDAO;
import la.foton.dpjmanager.entidades.rhour.Atividade;
import la.foton.dpjmanager.service.AtividadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("atividadeService")
public class AtividadeServiceImpl implements AtividadeService{
	@Autowired
	private AtividadeDAO atividadeDAO;
	
	@Override
	public List<Atividade> listaSolicitacoesPorProjeto(Long codProjeto)
	{
	   return atividadeDAO.listaSolicitacoesPorProjeto(codProjeto);
	}
	
	
}
