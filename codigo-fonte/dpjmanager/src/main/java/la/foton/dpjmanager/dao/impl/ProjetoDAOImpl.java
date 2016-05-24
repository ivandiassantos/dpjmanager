package la.foton.dpjmanager.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.ProjetoDAO;
import la.foton.dpjmanager.entidades.cq.Projeto;

@Repository
public class ProjetoDAOImpl extends DaoImpl<Projeto> implements ProjetoDAO
{

   @SuppressWarnings("unchecked")
   @Override
   public List<Projeto> obtemProjetosPorSolicitacao(String idSolicitacao)
   {
      List<Projeto> projetos = new ArrayList<>();
      StringBuilder sql = new StringBuilder();
      sql.append("select T3.dbid, T3.name ");
      sql.append("from atividade T1,repoproject T3,solicitacao T2,parent_child_links T2mm ");
      sql.append("where T1.projeto = T3.dbid ");
      sql.append("and T1.dbid = T2mm.parent_dbid  (+) ");
      sql.append("and 16810579 = T2mm.parent_fielddef_id  (+) ");
      sql.append("and T2mm.child_dbid = T2.dbid  (+)  ");
      sql.append("and (T1.dbid <> 0 ) ");
      sql.append("and T1.tipo_atividade = 'Projeto de Software' ");
      sql.append("and t2.id = ?1 order by T3.name");
      Query query = getEntityManagerCQ().createNativeQuery(sql.toString());
      query.setParameter(1, idSolicitacao);
      List<Object> lista = query.getResultList();
      for (Object object : lista)
      {
         Object[] resultado = (Object[]) object;
         Projeto projeto = new Projeto();
         projeto.setCodProjeto(((BigDecimal) resultado[0]).longValue());
         projeto.setNomeProjeto((String) resultado[1]);
         projetos.add(projeto);
      }
      return projetos;
   }

}
