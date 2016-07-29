package br.com.dpjmanager.dao;


public interface DefeitoDAO
{

   Long obtemQuantidadeDefeitosPorProjetoDisciplinaSolicitacao(String nomeDisciplina, String idSolicitacao);

   Long obtemQuantidadeHorasGastasComDefeitoPorDisciplinaProjetoSolicitacao(String nomeDisciplina, String idSolicitacao);
}
