<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="sidebar-nav navbar-collapse">
    <ul class="nav" id="side-menu">
        <li>
            <a href="#"><i class="fa fa-dashboard fa-fw"></i> Dashboard </a>
        </li>
        <li>
            <a href="#"><i class="fa fa-group fa-fw"></i> Unidades <span class="fa arrow"></span></a>
            <ul class="nav nav-second-level">
                <li>
                    <a href="<c:url value='/restrito/dashboardUnidade/iniciarDashboardUnidade'/>">UPJ - BASA</a>
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
        </li>
        <li>
            <a href="<c:url value='/restrito/pacote/iniciarPesquisaPacotes'/>"><i class="fa fa-briefcase fa-fw"></i> Pacotes </a>
        </li>
    </ul>
</div>