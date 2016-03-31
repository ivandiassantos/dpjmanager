package la.foton.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.AlocacaoDAO;
import la.foton.dpjmanager.entidades.Alocacao;
import la.foton.dpjmanager.service.AlocacaoService;

@Service("alocacaoService")
public class AlocacaoServiceImpl implements AlocacaoService {
	@Autowired
	private AlocacaoDAO alocacaoDAO;

	@Override
	public List<Alocacao> listarAlocacao() {
		return alocacaoDAO.listarAlocacao();
	}

}
