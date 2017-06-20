<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>    
   <head>
      <title>DPJ Manager</title>
      <meta charset="UTF-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>" />
      <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap-responsive.min.css'/>" />
      <link rel="stylesheet" href="<c:url value='/resources/css/matrix-login.css'/>" />
      <link href="<c:url value='/resources/font-awesome/css/font-awesome.css'/>" rel="stylesheet" />
      <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
   </head>
   <body>
      <div id="loginbox">
         <form:form id="loginform" class="form-vertical" servletRelativeAction="/restrito/usuarios/alterarSenhaAcesso" method="post">
            <div class="control-group normal_text">
               <h3><img src="<c:url value='/resources/img/logo.png'/>" alt="Logo" /></h3>
            </div>
            <div class="control-group">
               <div class="controls">
                  <c:if test="${!empty mensagemErro}">
                  <div class="alert alert-error alert-block"><a class="close" data-dismiss="alert" href="#">×</a>
                     <h4 class="alert-heading">Erro!</h4>
                     ${mensagemErro}
                  </div>
                  </c:if>
                  <c:if test="${!empty mensagemSucesso}">
                     <div class="alert alert-success alert-block"><a class="close" data-dismiss="alert" href="#">×</a>
                        <h4 class="alert-heading">Sucesso!</h4>
                        ${mensagemSucesso}
                     </div>
                  </c:if>
                  <c:if test="${!empty mensagemInformativa}">
                     <div class="alert alert-info alert-block"><a class="close" data-dismiss="alert" href="#">×</a>
                        <h4 class="alert-heading">Informação!</h4>
                        ${mensagemInformativa}
                     </div>
                  </c:if>
                  <div class="main_input_box">
                     <span class="add-on bg_lg">
                        <i class="icon-user"></i>
                     </span>
                     <input type="email" placeholder="E-mail" required name="login" maxlength="150"/>
                  </div>
               </div>
            </div>
            <div class="control-group">
               <div class="controls">
                  <div class="main_input_box">
                     <span class="add-on bg_ly">
                        <i class="icon-lock"></i>
                     </span>
                     <input type="password" placeholder="Senha Atual" required name="senhaAtual" maxlength="10"/>
                  </div>
               </div>
            </div>
            <div class="control-group">
               <div class="controls">
                  <div class="main_input_box">
                     <span class="add-on bg_ly">
                        <i class="icon-lock"></i>
                     </span>
                     <input type="password" placeholder="Nova Senha" required name="novaSenha" maxlength="10"/>
                  </div>
               </div>
            </div>
            <div class="control-group">
               <div class="controls">
                  <div class="main_input_box">
                     <span class="add-on bg_ly">
                        <i class="icon-lock"></i>
                     </span>
                     <input type="password" placeholder="Confirmação Nova Senha" required name="confirmacaoNovaSenha" maxlength="10"/>
                  </div>
               </div>
            </div>
            <div class="form-actions">
               <span class="pull-left"><a href="<c:url value='/'/>" class="flip-link btn btn-info" id="to-recover">Cancelar</a></span>
               <span class="pull-right"><input type="submit" class="btn btn-success" value="Alterar" /></span>
            </div>
         </form:form>
      </div>  
      <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>  
      <script src="<c:url value='/resources/js/matrix.login.js'/>"></script> 
   </body>
</html>