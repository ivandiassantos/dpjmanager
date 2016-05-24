package la.foton.dpjmanager.dao;


public interface DefeitoDAO
{

   Long obtemQuantidadeDefeitosPorProjetoDisciplinaSolicitacao(Long codProjeto, String nomeDisciplina, String idSolicitacao);

   Long obtemQuantidadeHorasGastasComDefeitoPorDisciplinaProjetoSolicitacao(Long codProjeto, String nomeDisciplina, String idSolicitacao);
}
