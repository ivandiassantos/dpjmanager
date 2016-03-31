package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.Projeto;


public interface ProjetoService {
	List<Projeto> listaPorCliente(Long codCliente);
}
