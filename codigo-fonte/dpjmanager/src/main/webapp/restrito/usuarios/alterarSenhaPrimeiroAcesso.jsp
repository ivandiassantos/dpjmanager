<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>DPJ Manager - Login</title>
    <!-- Bootstrap Core CSS -->
    <link href="<c:url value='/resources/novo/bootstrap/dist/css/bootstrap.min.css'/>" rel="stylesheet">
    <!-- MetisMenu CSS -->
    <link href="<c:url value='/resources/novo/metisMenu/dist/metisMenu.min.css'/>" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="<c:url value='/resources/novo/dist/css/sb-admin-2.css'/>" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="<c:url value='/resources/novo/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
   <div class="container">
      <div class="row">
         <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
               <div class="panel-heading">
                  <h3 class="panel-title">DPJ Manager - Autentica&ccedil;&atilde;o</h3>
               </div>
               <div class="panel-body">
                  <c:if test="${!empty mensagemErro}">
                     <div class="alert alert-danger alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        <strong>Erro.</strong>&nbsp;<c:out value="${mensagemErro}"/>
                     </div>
                  </c:if>
                  <c:if test="${!empty mensagemSucesso}">
                     <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        <strong>Erro.</strong>&nbsp;<c:out value="${mensagemSucesso}"/>
                     </div>
                  </c:if>
                  <p>Identificamos que este é seu primeiro acesso ao sistema. Informe uma nova senha de acesso.</p>
                  <form:form role="form" servletRelativeAction="/restrito/usuario/alterarSenhaAcesso" method="post">
                     <fieldset>
                        <div class="form-group">
                           <input class="form-control" placeholder="E-mail" name="login" type="email" autofocus required>
                        </div>
                        <div class="form-group">
                           <input class="form-control" placeholder="Senha Atual" name="senhaAtual" type="password" required autofocus>
                        </div>
                        <div class="form-group">
                           <input class="form-control" placeholder="Nova Senha" name="novaSenha" type="password" required autofocus>
                        </div>
                        <div class="form-group">
                           <input class="form-control" placeholder="Confirmação Nova Senha" name="confirmacaoNovaSenha" type="password" required autofocus>
                        </div>
                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Login"/>
                     </fieldset>
                  </form:form>
               </div>
            </div>
         </div>
      </div>
   </div>
    <!-- jQuery -->
    <script src="<c:url value='/resources/novo/jquery/dist/jquery.min.js'/>"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value='/resources/novo/bootstrap/dist/js/bootstrap.min.js'/>"></script>
    <!-- Metis Menu Plugin JavaScript -->
    <script src="<c:url value='/resources/novo/metisMenu/dist/metisMenu.min.js'/>"></script>
    <!-- Custom Theme JavaScript -->
    <script src="<c:url value='/resources/novo/dist/js/sb-admin-2.js'/>"></script>
</body>
</html>