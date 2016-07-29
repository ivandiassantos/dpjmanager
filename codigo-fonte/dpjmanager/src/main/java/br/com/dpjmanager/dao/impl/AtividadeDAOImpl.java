package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.AtividadeDAO;
import br.com.dpjmanager.entidades.rhour.Atividade;

@Repository
public class AtividadeDAOImpl extends DaoImpl<Atividade> implements AtividadeDAO
{

   // @Override
   // public List<Atividade> obtemAtividadePorIdSolicitacao(String idSolicitacao)
   // {
   // List<Atividade>
   // return null;
   // }

   // @SuppressWarnings("unchecked")
   // @Override
   // public List<Atividade> obtemPorProjetoSolicitacao(Long codProjeto, String idSolicitacao)
   // {
   // List<Atividade> listaAtividades = new ArrayList<>();
   // StringBuilder sql = new StringBuilder();
   // sql.append("select atividade.* from atividade atividade, solicitacao solicitacao, parent_child_links links ");
   // sql.append("where atividade.dbid = links.parent_dbid ");
   // sql.append("and links.child_dbid = solicitacao.dbid ");
   // sql.append("and atividade.projeto = ?1 ");
   // sql.append("and solicitacao.id = ?2 ");
   // sql.append("and atividade.is_active = 1 ");
   // sql.append("and atividade.subtipo_atividade is not null ");
   // sql.append("order by atividade.tipo_atividade ");
   // Query query = getEntityManagerCQ().createNativeQuery(sql.toString());
   // query.setParameter(1, codProjeto);
   // query.setParameter(2, idSolicitacao);
   // List<Object> resultadoPesquisa = query.getResultList();
   // converteListaAtividades(listaAtividades, resultadoPesquisa);
   // return listaAtividades;
   // }

   // private void converteListaAtividades(List<Atividade> listaAtividades, List<Object> resultadoPesquisa)
   // {
   // for (Object object : resultadoPesquisa)
   // {
   // Atividade atividade = new Atividade();
   // Object[] parametros = (Object[]) object;
   // atividade.setCodAtividade(parametros[0] != null ? ((BigDecimal) parametros[0]).longValue() : null);
   // atividade.setAtivo(parametros[1] != null ? ((BigDecimal) parametros[1]).intValue() : null);
   // atividade.setIdAtividade(parametros[2] != null ? (String) parametros[2] : null);
   // atividade.setEstado(parametros[3] != null ? ((BigDecimal) parametros[3]).longValue() : null);
   // atividade.setVersion(parametros[4] != null ? ((BigDecimal) parametros[4]).intValue() : null);
   // atividade.setVersaoBloqueada(parametros[5] != null ? ((BigDecimal) parametros[5]).intValue() : null);
   // atividade.setBloqueadoPor(parametros[6] != null ? ((BigDecimal) parametros[6]).intValue() : null);
   // atividade.setRatlMastership(parametros[7] != null ? ((BigDecimal) parametros[7]).intValue() : null);
   // atividade.setDuplicado(parametros[8] != null ? ((BigDecimal) parametros[8]).intValue() : null);
   // atividade.setEstadoNaoDuplicado(parametros[9] != null ? ((BigDecimal) parametros[9]).intValue() : null);
   // atividade.setHeadLine(parametros[10] != null ? (String) parametros[10] : null);
   // atividade.setOwner(parametros[11] != null ? ((BigDecimal) parametros[11]).intValue() : null);
   // atividade.setDescricao(parametros[12] != null ? (String) parametros[12] : null);
   // atividade.setDataInicialPlanejada(parametros[13] != null ? (Date) parametros[13] : null);
   // atividade.setDataFinalPlanejada(parametros[14] != null ? (Date) parametros[14] : null);
   // atividade.setHorasTrabalhoPlanejadas(parametros[15] != null ? Long.valueOf((String) parametros[15]) : null);
   // atividade.setHorasTrabalhoFaltantes(parametros[16] != null ? ((BigDecimal) parametros[16]).longValue() : null);
   // atividade.setDuracaoHorasPlanejadas(parametros[17] != null ? Long.valueOf((String) parametros[17]) : null);
   // atividade.setDuracaoHorasPlanejadasFaltantes(parametros[18] != null ? ((BigDecimal) parametros[18]).longValue() : null);
   // atividade.setDataInicioTrabalho(parametros[19] != null ? (Date) parametros[19] : null);
   // atividade.setDataFinalTrabalho(parametros[20] != null ? (Date) parametros[20] : null);
   // atividade.setHorasRealizadas(parametros[21] != null ? Long.valueOf((String) parametros[21]) : null);
   // atividade.setResolucao(parametros[24] != null ? (String) parametros[24] : null);
   // atividade.setProjeto(parametros[25] != null ? ((BigDecimal) parametros[25]).longValue() : null);
   // atividade.setTipoAtividade(parametros[26] != null ? (String) parametros[26] : null);
   // atividade.setSubTipoAtividade(parametros[27] != null ? (String) parametros[27] : null);
   // atividade.setAtividade(parametros[28] != null ? (String) parametros[28] : null);
   // atividade.setExecutorAtividade(parametros[30] != null ? ((BigDecimal) parametros[30]).longValue() : null);
   // atividade.setBaseline(parametros[31] != null ? (String) parametros[31] : null);
   // atividade.setAtividadeConclusao(parametros[32] != null ? (String) parametros[32] : null);
   // atividade.setPermissaoAcao(parametros[33] != null ? (String) parametros[33] : null);
   // atividade.setVersao(parametros[34] != null ? (String) parametros[34] : null);
   // atividade.setAtividadeMae(parametros[35] != null ? (String) parametros[35] : null);
   // atividade.setIdentificadorEscopo(parametros[36] != null ? (String) parametros[36] : null);
   // atividade.setDataInicialEstimada(parametros[37] != null ? (Date) parametros[37] : null);
   // atividade.setDataFinalEstimada(parametros[38] != null ? (Date) parametros[38] : null);
   // atividade.setTrabalhoEstimado(parametros[39] != null ? Long.valueOf((String) parametros[39]) : null);
   // atividade.setIteracao(parametros[40] != null ? (String) parametros[40] : null);
   // atividade.setTrabalhoConclusao(parametros[41] != null ? (String) parametros[41] : null);
   // atividade.setIndicacaoMigracao(parametros[42] != null ? ((BigDecimal) parametros[42]).longValue() : null);
   // atividade.setNomeAtividade(parametros[43] != null ? (String) parametros[43] : null);
   // atividade.setCriarAtividadeAssociada(parametros[44] != null ? ((BigDecimal) parametros[44]).longValue() : null);
   // atividade.setIndicadorEstimado(parametros[45] != null ? ((BigDecimal) parametros[45]).longValue() : null);
   // atividade.setIndicadorRealizado(parametros[46] != null ? ((BigDecimal) parametros[46]).longValue() : null);
   // atividade.setPrazoEstimadoInicial(parametros[47] != null ? (Date) parametros[47] : null);
   // atividade.setPrazoEstimadoFinal(parametros[48] != null ? (Date) parametros[48] : null);
   // listaAtividades.add(atividade);
   // }
   // }

   @SuppressWarnings("unchecked")
   @Override
   public Atividade obtemSolicitacaoPorIdSolicitacao(String idSolicitacao)
   {
      TypedQuery<Atividade> query = (TypedQuery<Atividade>) getEntityManagerRhour().createNamedQuery("listaPorIdSolicitacao");
      query.setParameter("nomeAtividade", idSolicitacao + "%");
      List<Atividade> lista = query.getResultList();
      if (!lista.isEmpty())
      {
         return lista.get(0);
      }
      return null;
   }

   @Override
   public Atividade obtemPorId(Long codAtividade)
   {
      return getEntityManagerRhour().find(Atividade.class, codAtividade);
   }
}
