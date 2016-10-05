package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.UnidadeDAO;
import br.com.dpjmanager.entidades.dpjmanager.Unidade;
import br.com.dpjmanager.service.UnidadeService;

@Service("unidadeService")
public class UnidadeServiceImpl implements UnidadeService
{

   @Autowired
   private UnidadeDAO unidadeDAO;

   @Override
   public List<Unidade> listar()
   {
      return unidadeDAO.listar();
   }
}
