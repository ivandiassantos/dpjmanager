package br.com.dpjmanager.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.ProjetoCQDAO;
import br.com.dpjmanager.entidades.cq.ProjetoCQ;

/**
 * DAO para obtenção de dados referentes a tabela de projetos do CQ.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Repository
public class ProjetoCQDAOImpl extends DaoImpl implements ProjetoCQDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.ProjetoCQDAO#listarPorSolicitacao(java.lang.String)
    */
   @SuppressWarnings("unchecked")
   @Override
   public List<ProjetoCQ> listarPorSolicitacao(String numeroSolicitacao)
   {
      StringBuilder sql = new StringBuilder();
      sql.append("select distinct repoproject.dbid, repoproject.name from solicitacao solicitacao ");
      sql.append("inner join parent_child_links links ");
      sql.append("on links.child_dbid = solicitacao.dbid ");
      sql.append("inner join atividade atividade ");
      sql.append("on atividade.dbid = links.parent_dbid ");
      sql.append("inner join repoproject repoproject ");
      sql.append("on repoproject.dbid = atividade.projeto ");
      sql.append("where solicitacao.id = ?1 ");
      Query query = getEntityManagerCQ().createNativeQuery(sql.toString());
      query.setParameter(1, numeroSolicitacao);
      List<Object> resultado = query.getResultList();
      return converterListaProjetos(resultado);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.ProjetoCQDAO#obtemPorId(java.lang.Long)
    */
   @Override
   public ProjetoCQ obtemPorId(Long id)
   {
      return getEntityManagerCQ().find(ProjetoCQ.class, id);
   }

   /**
    * Converte a lista com object para uma lista tipada.
    * 
    * @param resultado
    * @return {@link List<ProjetoCQ>}
    */
   private List<ProjetoCQ> converterListaProjetos(List<Object> resultado)
   {
      List<ProjetoCQ> projetos = new ArrayList<>();
      for (Object object : resultado)
      {
         Object[] valores = (Object[]) object;
         BigDecimal codigoProjeto = (BigDecimal) valores[0];
         String descricaoProjeto = (String) valores[1];
         projetos.add(new ProjetoCQ(codigoProjeto.longValue(), descricaoProjeto));
      }
      return projetos;
   }

}
