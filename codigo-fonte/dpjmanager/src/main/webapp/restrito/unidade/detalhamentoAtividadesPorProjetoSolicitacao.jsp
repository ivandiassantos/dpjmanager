<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-dashboard" tituloFuncionalidade="Dashboard - UPJ BASA">
   <fieldset>
      <table class="table table-striped table-bordered">
         <thead>
            <th>Disciplina</th>
            <th>Horas Planejadas</th>
            <th>Horas Realizadas</th>
            <th>Quantidade de Defeitos</th>
            <th>Horas com Defeito</th>
            <th>Percentual de Horas de Defeitos</th>
            <th>Custo</th>
            <th>PF</th>
         </thead>
         <tbody>
            <c:forEach items="${listaDetalhamentoDisciplina}" var="detalhamentoDisciplinaDTO">
	            <tr>
	              <td>${detalhamentoDisciplinaDTO.nomeDisciplina}</td>
	              <td>${detalhamentoDisciplinaDTO.totalHorasPlanejadas}</td>
	              <td>${detalhamentoDisciplinaDTO.totalHorasRealizadas}</td>
	              <td>${detalhamentoDisciplinaDTO.quantidadeDefeitos}</td>
	              <td>${detalhamentoDisciplinaDTO.quantidadeHorasGastasDefeitos}</td>
	              <td></td>
	              <td></td>
	              <td></td>
	            </tr>
            </c:forEach>
         </tbody>
      </table>
   </fieldset>
</customTags:templateFuncionalidades>