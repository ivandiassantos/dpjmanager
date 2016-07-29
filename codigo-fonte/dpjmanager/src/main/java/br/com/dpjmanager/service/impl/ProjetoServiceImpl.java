
package br.com.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.ProjetoDAO;
import br.com.dpjmanager.dto.ProjetoDTO;
import br.com.dpjmanager.entidades.rhour.Projeto;
import br.com.dpjmanager.service.ProjetoService;

@Service("projetoService")
public class ProjetoServiceImpl implements ProjetoService
{

   @Autowired
   private ProjetoDAO projetoDAO;

   @Override
   public List<ProjetoDTO> listaPorIdSolicitacao(String idSolicitacao)
   {
      List<ProjetoDTO> listaProjetos = new ArrayList<>();
      List<Projeto> projetos = projetoDAO.listaPorSolicitacao(idSolicitacao);
      for (Projeto projeto : projetos)
      {
         ProjetoDTO projetoDTO = new ProjetoDTO();
         projetoDTO.setCodProjeto(projeto.getCodProjeto());
         projetoDTO.setNomeProjeto(projeto.getNomeProjeto());
         listaProjetos.add(projetoDTO);
      }
      return listaProjetos;
   }

}
