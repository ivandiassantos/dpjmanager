
package br.com.dpjmanager.service;

import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.exception.BusinessException;

public interface PacoteService
{

   void incluirPacote(Pacote pacote, String solicitacoes) throws BusinessException;
}
