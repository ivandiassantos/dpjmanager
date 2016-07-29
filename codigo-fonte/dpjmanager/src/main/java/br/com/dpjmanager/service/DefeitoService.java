
package br.com.dpjmanager.service;


public interface DefeitoService
{

   Long obtemQuantidadeDefeitosPorDisciplinaSolicitacao(String nomeDisciplina, String idSolicitacao);

   Long obtemQuantidadeHorasGastasDefeitoPorProjetoDisciplinaSolicitacao(String nomeDisciplina, String idSolicitacao);
}
