<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>DPJ Manager</title>
    <link href="<c:url value='/resources/novo/bootstrap/dist/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/metisMenu/dist/metisMenu.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/dist/css/timeline.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/dist/css/sb-admin-2.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/morrisjs/morris.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value='/restrito/principal'/>">DPJ Manager</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        &nbsp;Usu&aacute;rio&nbsp;<i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li>
                           <a href="#">
                              <i class="fa fa-sign-out fa-fw"></i> Sair
                           </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="#"><i class="fa fa-dashboard fa-fw"></i> Dashboard </a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-group fa-fw"></i> Unidades <span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="#">UPJ - BASA</a>
                                </li>
                                <li>
                                    <a href="#">UPJ - BRB</a>
                                </li>
                                <li>
                                    <a href="#">UPJ - CAIXA</a>
                                </li>
                                <li>
                                    <a href="#">UPJ - MB</a>
                                </li>
                                <li>
                                    <a href="#">UPJ - BANPARÁ</a>
                                </li>
                                <li>
                                    <a href="#">OUTROS</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Dashboard - UPJ - BASA</h1>
                </div>
                <div class="col-md-6 col-xs-6">
                  <a href="#" class="thumbnail">
                     <img src="<c:url value='/resources/novo/imagens/dashboard/UPJ1.png'/>"/>
                  </a>
                  <p>
                     <button type="button" class="btn btn-default"><i class="fa fa-upload"></i> Substituir</button>
                     <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal"><i class="fa fa-search"></i> Ampliar</button>
                  </p>
                </div>
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog modal-lg" role="document">
                        <div class="modal-content">
                            <div class="modal-body">
                                <img src="<c:url value='/resources/novo/imagens/dashboard/UPJ1.png'/>"/>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->
                <div class="col-md-6 col-xs-6">
                  <a href="#" class="thumbnail">
                     <img src="<c:url value='/resources/novo/imagens/dashboard/UPJ4.png'/>"/>
                  </a>
                  <p>
                     <button type="button" class="btn btn-default"><i class="fa fa-upload"></i> Substituir</button>
                     <button type="button" class="btn btn-default"><i class="fa fa-search"></i> Ampliar</button>
                  </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 col-xs-12">
                  <a href="#" class="thumbnail">
                     <img src="<c:url value='/resources/novo/imagens/dashboard/UPJ3.png'/>"/>
                  </a>
                  <p>
                     <button type="button" class="btn btn-default"><i class="fa fa-upload"></i> Substituir</button>
                     <button type="button" class="btn btn-default"><i class="fa fa-search"></i> Ampliar</button>
                  </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12 col-xs-12">
                  <a href="#" class="thumbnail">
                     <img src="<c:url value='/resources/novo/imagens/dashboard/UPJ2.png'/>"/>
                  </a>
                  <p>
                     <button type="button" class="btn btn-default"><i class="fa fa-upload"></i> Substituir</button>
                     <button type="button" class="btn btn-default"><i class="fa fa-search"></i> Ampliar</button>
                  </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 col-xs-6">
                  <a href="#" class="thumbnail">
                     <img src="<c:url value='/resources/novo/imagens/dashboard/UPJ5.png'/>"/>
                  </a>
                  <p>
                     <button type="button" class="btn btn-default"><i class="fa fa-upload"></i> Substituir</button>
                     <button type="button" class="btn btn-default"><i class="fa fa-search"></i> Ampliar</button>
                  </p>
                </div>
                <div class="col-md-6 col-xs-6">
                  <a href="#" class="thumbnail">
                     <img src="<c:url value='/resources/novo/imagens/dashboard/UPJ5.png'/>"/>
                  </a>
                  <p>
                     <button type="button" class="btn btn-default"><i class="fa fa-upload"></i> Substituir</button>
                     <button type="button" class="btn btn-default"><i class="fa fa-search"></i> Ampliar</button>
                  </p>
                </div>
            </div>
        </div>
    </div>
    <script src="<c:url value='/resources/novo/jquery/dist/jquery.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/bootstrap/dist/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/metisMenu/dist/metisMenu.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/raphael/raphael-min.js'/>"></script>
    <script src="<c:url value='/resources/novo/morrisjs/morris.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/dist/js/sb-admin-2.js'/>"></script>
</body>
</html>