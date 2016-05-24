package la.foton.dpjmanager.service;


public interface DefeitoService
{

   Long obtemQuantidadeDefeitosPorDisciplinaSolicitacao(Long codProjeto, String nomeDisciplina, String idSolicitacao);

   Long obtemQuantidadeHorasGastasDefeitoPorProjetoDisciplinaSolicitacao(Long codProjeto, String nomeDisciplina, String idSolicitacao);
}
