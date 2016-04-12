package la.foton.dpjmanager.service;

import java.util.List;

import la.foton.dpjmanager.dto.DashboardPlanejamentoDTO;

public interface DashboardPlanejamentoService {
	List<DashboardPlanejamentoDTO> obtemDashboardPlanejamentoPorCliente(Long codCliente);
}
