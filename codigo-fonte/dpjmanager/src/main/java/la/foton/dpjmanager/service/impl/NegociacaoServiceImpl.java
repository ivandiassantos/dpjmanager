package la.foton.dpjmanager.service.impl;

import java.util.Date;
import java.util.List;

import la.foton.dpjmanager.dao.NegociacaoDAO;
import la.foton.dpjmanager.entidades.rhour.Negociacao;
import la.foton.dpjmanager.service.NegociacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("negociacaoService")
public class NegociacaoServiceImpl implements NegociacaoService {
	@Autowired
	private NegociacaoDAO negociacaoDAO;

	@Override
	public List<Negociacao> listarNegociacoes(Long codigoIntegrante, Date dataInicio, Date dataFinal) {
		return negociacaoDAO.listarNegociacoes(codigoIntegrante, dataInicio, dataFinal);
	}
}
