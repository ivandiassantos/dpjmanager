
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.dto.ProjetoDTO;


public interface ProjetoService
{

   List<ProjetoDTO> listaPorIdSolicitacao(String idSolicitacao);
}
