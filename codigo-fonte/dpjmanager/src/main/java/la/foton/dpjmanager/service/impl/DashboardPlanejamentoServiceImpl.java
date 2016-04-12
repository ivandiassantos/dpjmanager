package la.foton.dpjmanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import la.foton.dpjmanager.dto.DashboardPlanejamentoDTO;
import la.foton.dpjmanager.entidades.rhour.Projeto;
import la.foton.dpjmanager.service.DashboardPlanejamentoService;
import la.foton.dpjmanager.service.ProjetoService;

@Service("dashboardPlanejamentoService")
public class DashboardPlanejamentoServiceImpl implements
		DashboardPlanejamentoService {

	@Autowired
	private ProjetoService projetoService;

	@Override
	public List<DashboardPlanejamentoDTO> obtemDashboardPlanejamentoPorCliente(Long codCliente) {
		List<Projeto> projetos = projetoService.listaPorCliente(codCliente);
		return null;
	}

}
