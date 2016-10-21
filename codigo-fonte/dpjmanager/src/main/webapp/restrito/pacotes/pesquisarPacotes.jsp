<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags/novo" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<customTags:template>
   <div class="row">
      <div class="col-lg-12">
         <h1 class="page-header">Pacotes</h1>
      </div>
   </div>
   <div class="row">
      <div class="col-lg-12">
         <div class="panel panel-default">
            <div class="panel-heading">
               Pesquisar Pacotes
            </div>
            <div class="panel-body">
               <div class="row">
                  <div class="col-lg-6">
	                  <form role="form">
	                      <div class="form-group">
	                          <label>Text Input</label>
	                          <input class="form-control">
	                      </div>
	                  </form>
	               </div>
               </div>
            </div>
         </div>
     </div>
   </div>
</customTags:template>