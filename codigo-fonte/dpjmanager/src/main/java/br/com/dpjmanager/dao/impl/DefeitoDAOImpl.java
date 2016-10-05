package br.com.dpjmanager.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.DefeitoDAO;

@Repository
public class DefeitoDAOImpl extends DaoImpl implements DefeitoDAO
{

   @Override
   public Long obtemQuantidadeDefeitosPorProjetoDisciplinaSolicitacao(String nomeDisciplina, String idSolicitacao)
   {
      StringBuilder sql = new StringBuilder();
      sql.append("select count(T1.dbid) ");
      sql.append("from defeito T1,solicitacao T3,parent_child_links T3mm,repoproject T6 ");
      sql.append("where T1.dbid = T3mm.parent_dbid  (+) ");
      sql.append("and 16815107 = T3mm.parent_fielddef_id  (+) ");
      sql.append("and T3mm.child_dbid = T3.dbid  (+) ");
      sql.append("and T1.projeto = T6.dbid ");
      sql.append("and T1.origem in (?1) and T3.id = ?2");
      Query query = getEntityManagerCQ().createNativeQuery(sql.toString());
      query.setParameter(1, nomeDisciplina);
      query.setParameter(2, idSolicitacao);
      Long qtdRegistros = ((BigDecimal) query.getSingleResult()).longValue();
      return qtdRegistros;
   }

   @Override
   public Long obtemQuantidadeHorasGastasComDefeitoPorDisciplinaProjetoSolicitacao(String nomeDisciplina, String idSolicitacao)
   {
      List<Long> codigosDefeitos = obtemCodigosDefeitosPorProjetoDisciplinaSolicitacao(nomeDisciplina, idSolicitacao);
      if (!codigosDefeitos.isEmpty())
      {
         List<Long> codigosAtividades = obtemCodigosAtividadesDefeitos(codigosDefeitos);
         String sqlQuantidadeHoras = "select sum(AM_PLANNED_DURATION) from atividade where dbid in(?1)";
         Query query = getEntityManagerCQ().createNativeQuery(sqlQuantidadeHoras);
         query.setParameter(1, codigosAtividades);
         Long qtdHoras = ((BigDecimal) query.getSingleResult()).longValue();
         return qtdHoras;
      }
      return 0L;
   }

   @SuppressWarnings("unchecked")
   private List<Long> obtemCodigosAtividadesDefeitos(List<Long> codigosDefeitos)
   {
      List<Long> codigosAtividades = new ArrayList<>();
      String sql = "select distinct (parent_dbid) from parent_child_links where child_dbid in (?1)";
      Query query = getEntityManagerCQ().createNativeQuery(sql);
      query.setParameter(1, codigosDefeitos);
      List<Object> resultadoPesquisa = query.getResultList();
      for (Object object : resultadoPesquisa)
      {
         codigosAtividades.add(((BigDecimal) object).longValue());
      }
      return codigosAtividades;
   }

   @SuppressWarnings("unchecked")
   private List<Long> obtemCodigosDefeitosPorProjetoDisciplinaSolicitacao(String nomeDisciplina, String idSolicitacao)
   {
      List<Long> codigosDefeitos = new ArrayList<>();
      StringBuilder sql = new StringBuilder();
      sql.append("select distinct(T1.dbid) ");
      sql.append("from defeito T1,solicitacao T3,parent_child_links T3mm,repoproject T6 ");
      sql.append("where T1.dbid = T3mm.parent_dbid  (+) ");
      sql.append("and 16815107 = T3mm.parent_fielddef_id  (+) ");
      sql.append("and T3mm.child_dbid = T3.dbid  (+) ");
      sql.append("and T1.projeto = T6.dbid ");
      sql.append("and T1.origem in (?1) ");
      sql.append("and T3.id = ?2");
      Query query = getEntityManagerCQ().createNativeQuery(sql.toString());
      query.setParameter(1, nomeDisciplina);
      query.setParameter(2, idSolicitacao);
      List<Object> valores = query.getResultList();
      for (Object object : valores)
      {
         codigosDefeitos.add(((BigDecimal) object).longValue());
      }
      return codigosDefeitos;
   }

}
