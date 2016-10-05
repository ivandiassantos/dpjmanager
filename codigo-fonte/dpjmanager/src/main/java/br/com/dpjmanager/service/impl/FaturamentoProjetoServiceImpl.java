package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.FaturamentoProjetoDAO;
import br.com.dpjmanager.entidades.dpjmanager.FaturamentoProjeto;
import br.com.dpjmanager.service.FaturamentoProjetoService;

@Service("faturamentoProjetoService")
public class FaturamentoProjetoServiceImpl implements FaturamentoProjetoService
{

   @Autowired
   private FaturamentoProjetoDAO faturamentoProjetoDAO;
   @Override
   public List<FaturamentoProjeto> listar()
   {
      return faturamentoProjetoDAO.listar();
   }

}
