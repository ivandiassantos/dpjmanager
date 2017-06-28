<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
      <meta charset="utf-8" />
      <title>Login - Alpha</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
      <!-- bootstrap & fontawesome -->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/bootstrap.min.css'/>" />
      <link rel="stylesheet" href="<c:url value='/resources/assets/font-awesome/4.5.0/css/font-awesome.min.css'/>" />
      <!-- text fonts -->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/fonts.googleapis.com.css'/>" />
      <!-- ace styles -->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace.min.css'/>" />
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/alpha.css'/>" />
      <!--[if lte IE 9]>
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace-part2.min.css'/>" />
      <![endif]-->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace-rtl.min.css'/>" />
      <!--[if lte IE 9]>
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace-ie.min.css'/>" />
      <![endif]-->
      <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->
      <!--[if lte IE 8]>
      <script src="<c:url value='/resources/assets/js/html5shiv.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/respond.min.js'/>"></script>
      <![endif]-->
   </head>
   <body class="login-layout light-login">
      <div class="main-container">
         <div class="main-content">
            <div class="row">
               <div class="col-sm-10 col-sm-offset-1">
                  <div class="login-container">
                     <div class="center">
                        <h1>
                           <span class="red">Alpha</span>
                        </h1>
                     </div>
                     <div class="space-6"></div>
                     <div class="position-relative">
                     <div id="login-box" class="login-box visible widget-box no-border">
                        <div class="widget-body">
                           <div class="widget-main">
                              <h4 class="header blue lighter bigger">
                                 Altera&ccedil;&atilde;o de Senha
                              </h4>
                              <div class="space-6"></div>
                              <p>Identificamos que este é seu primeiro acesso. Será necessário informar uma nova senha.</p>
                              <spring:hasBindErrors name="usuario">
                                 <div class="alert alert-danger">
                                    <button type="button" class="close" data-dismiss="alert">
                                       <i class="ace-icon fa fa-times"></i>
                                    </button>
                                    <ul style="listaErros">
                                       <c:forEach var="erro" items="${errors.allErrors}">
                                          <li>
                                             <strong>
                                                <i class="ace-icon fa fa-close"></i>
                                             </strong>
                                             &nbsp;<spring:message code="${erro.code}" text="${erro.defaultMessage}"/>
                                          </li>
                                       </c:forEach>
                                    </ul>
                                 </div>
                              </spring:hasBindErrors>
                              <c:if test="${!empty mensagemErro}">
                                 <div class="alert alert-danger">
                                    <button type="button" class="close" data-dismiss="alert">
                                       <i class="ace-icon fa fa-times"></i>
                                    </button>
                                    <strong>
                                       <i class="ace-icon fa fa-times"></i>
                                    </strong>
                                    &nbsp;${mensagemErro}
                                    <br />
                                 </div>
                              </c:if>
                              <form:form servletRelativeAction="/restrito/comum/usuarios/alteraSenhaUsuario" method="post"  commandName="formAlteracaoSenhaUsuario">
                                 <fieldset>
                                    <label class="block clearfix">
                                       <span class="block input-icon input-icon-right">
                                          <input type="text" name="login" required class="form-control" maxlength="50" placeholder="Login" />
                                          <i class="ace-icon fa fa-user"></i>
                                       </span>
                                    </label>
                                    <label class="block clearfix">
                                       <span class="block input-icon input-icon-right">
                                          <input type="password" name="senha" required class="form-control" maxlength="10" placeholder="Senha Atual" />
                                          <i class="ace-icon fa fa-lock"></i>
                                       </span>
                                    </label>
                                    <label class="block clearfix">
                                       <span class="block input-icon input-icon-right">
                                          <input type="password" name="novaSenha" required class="form-control" maxlength="10" placeholder="Nova Senha" />
                                          <i class="ace-icon fa fa-lock"></i>
                                       </span>
                                    </label>
                                    <label class="block clearfix">
                                       <span class="block input-icon input-icon-right">
                                          <input type="password" name="confirmacaoNovaSenha" required class="form-control" maxlength="10" placeholder="Confirmação da Nova Senha" />
                                          <i class="ace-icon fa fa-lock"></i>
                                       </span>
                                    </label>
                                    <div class="space"></div>
                                    <div class="clearfix">
                                       <label class="inline">
                                          <a href="#"><span class="lbl">Esqueceu a senha?</span></a>
                                       </label>
                                       <button type="submit" class="width-35 pull-right btn btn-sm btn-primary">
                                          <i class="ace-icon fa fa-key"></i><span class="bigger-110">Alterar</span>
                                       </button>
                                    </div>
                                    <div class="space-4"></div>
                                 </fieldset>
                              </form:form>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </div>
   <!--[if !IE]> -->
      <script src="<c:url value='/resources/assets/js/jquery-2.1.4.min.js'/>"></script>
   <!-- <![endif]-->
   <!--[if IE]>
      <script src="assets/js/jquery-1.11.3.min.js"></script>
   <![endif]-->
   <script type="text/javascript">
       if ('ontouchstart' in document.documentElement)
         document.write("<script src='assets/js/jquery.mobile.custom.min.js'>" + "<"+"/script>");
   </script>
   <!-- inline scripts related to this page -->
   <script type="text/javascript">
       jQuery(function($) {
         $(document).on('click', '.toolbar a[data-target]', function(e) {
            e.preventDefault();
            var target = $(this).data('target');
            $('.widget-box.visible').removeClass('visible');//hide others
            $(target).addClass('visible');//show target
         });
       });
   </script>
   </body>
</html>
