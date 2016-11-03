<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <!-- Meta, title, CSS, favicons, etc. -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>DPJ Manager | Login</title>
      <!-- Bootstrap core CSS -->
      <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
      <link href="<c:url value='/resources/fonts/css/font-awesome.min.css'/>" rel="stylesheet">
		<link href="<c:url value='/resources/css/animate.min.css'/>" rel="stylesheet">
		<!-- Custom styling plus plugins -->
		<link href="<c:url value='/resources/css/custom.css'/>" rel="stylesheet">
		<link href="<c:url value='/resources/css/icheck/flat/green.css'/>" rel="stylesheet">
		<script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
      <!--[if lt IE 9]>
         <script src="<c:url value='/resources/assets/js/ie8-responsive-file-warning.js'/>"></script>
      <![endif]-->
      <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
         <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
      <![endif]-->
   </head>
   <body style="background:#F7F7F7;">
      <div class="">
         <a class="hiddenanchor" id="toregister"></a>
         <a class="hiddenanchor" id="tologin"></a>
         <div id="wrapper">
            <div id="login" class="animate form">
               <section class="login_content">
                  <form:form role="form" servletRelativeAction="/autenticar" method="post">
                     <h1>Login</h1>
                     <c:if test="${!empty mensagemSucesso}">
	                     <div class="alert alert-success alert-dismissible fade in" role="alert">
			                  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
			                  </button>
			                  <span class="glyphicon glyphicon-ok-sign"></span><strong>&nbsp;Sucesso!&nbsp;</strong>&nbsp;<c:out value="${mensagemSucesso}"/>
	                     </div>
	                  </c:if>
	                  <c:if test="${!empty mensagemErro}">
	                     <div class="alert alert-danger alert-dismissible fade in" role="alert">
		                     <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
		                     </button>
		                     <span class="glyphicon glyphicon-warning-sign"></span><strong>&nbsp;Erro!&nbsp;</strong><c:out value="${mensagemErro}"/>
	                     </div>
	                  </c:if>
                     <div>
                        <input type="text" class="form-control" placeholder="Login" name="login" required/>
                     </div>
							<div>
							   <input type="password" class="form-control" placeholder="Senha" name="senha" required/>
							</div>
                     <div>
								<input type="submit" class="btn btn-default" value="Entrar"/>
								<a class="reset_pass" href="#">Esqueceu a senha?</a>
							</div>
                     <div class="clearfix"></div>
							<div class="separator">
								<div>
									<h1>DPJ Manager</h1>
									<p>©2015 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
								</div>
							</div>
                  </form:form>
						<!-- form -->
               </section>
               <!-- content -->
            </div>
         </div>
      </div>
   </body>
</html>