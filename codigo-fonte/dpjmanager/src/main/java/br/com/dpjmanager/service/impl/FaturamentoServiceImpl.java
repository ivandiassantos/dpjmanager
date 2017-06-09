package br.com.dpjmanager.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.dpjmanager.dao.FaturamentoDAO;
import br.com.dpjmanager.entidades.cq.ProjetoCQ;
import br.com.dpjmanager.entidades.dpjmanager.Fase;
import br.com.dpjmanager.entidades.dpjmanager.Faturamento;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.dpjmanager.Projeto;
import br.com.dpjmanager.entidades.dpjmanager.ProjetoFase;
import br.com.dpjmanager.service.FaseService;
import br.com.dpjmanager.service.FaturamentoService;
import br.com.dpjmanager.service.PacoteService;
import br.com.dpjmanager.service.ProjetoCQService;
import br.com.dpjmanager.service.ProjetoFaseService;
import br.com.dpjmanager.service.ProjetoService;

/**
 * Serviço para funcionalidades referentes a faturamento.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Service("faturamentoService")
public class FaturamentoServiceImpl implements FaturamentoService
{

   @Autowired
   private PacoteService pacoteService;

   @Autowired
   private ProjetoService projetoService;

   @Autowired
   private ProjetoCQService projetoCQService;

   @Autowired
   private FaseService faseService;

   @Autowired
   private ProjetoFaseService projetoFaseService;

   @Autowired
   private FaturamentoDAO faturamentoDAO;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.FaturamentoService#incluirFaturamento(br.com.dpjmanager.entidades.dpjmanager.Faturamento,
    *      java.lang.Long, java.lang.Long, java.lang.Long)
    */
   @Transactional(propagation = Propagation.REQUIRED, transactionManager = "transactionManagerDpjManager")
   @Override
   public void incluirFaturamento(Faturamento faturamento, Long codPacote, Long codProjeto, Long codFase)
   {
      Pacote pacote = pacoteService.obtemPorId(codPacote);
      faturamento.setPacote(pacote);
      Projeto projeto = projetoService.obtemPorCodigoProjetoCQ(codProjeto);
      if (projeto == null)
      {
         ProjetoCQ projetoCQ = projetoCQService.obtemPorId(codProjeto);
         projeto = new Projeto();
         projeto.setDescricaoProjeto(projetoCQ.getDescricaoProjeto());
         projeto.setCodProjetoCQ(projetoCQ.getCodProjeto());
         projeto.setCodCliente(1L);
         projetoService.incluirProjeto(projeto);
         faturamento.setProjeto(projeto);
      }
      faturamento.setDataCadastro(new Date());
      faturamento.setProjeto(projeto);
      faturamentoDAO.incluirFaturamento(faturamento);
      Fase fase = faseService.obtemPorId(codFase);
      ProjetoFase projetoFase = new ProjetoFase(projeto, fase);
      projetoFaseService.incluirProjetoFase(projetoFase);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.FaturamentoService#listar()
    */
   @Override
   public List<Faturamento> listar()
   {
      return faturamentoDAO.listar();
   }
}
