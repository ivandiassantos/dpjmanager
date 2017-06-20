<!--Header-part-->
<div id="header">
   <h1><a href="<c:url value='/restrito/principal'/>">DPJ Manager</a></h1>
</div>
<!--close-Header-part-->
<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
   <ul class="nav">
      <li class="dropdown" id="profile-messages" >
         <a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle">
            <i class="icon icon-user"></i>
            <span class="text"><security:authentication property="principal.nomeUsuario" /></span>
            <b class="caret"></b>
         </a>
         <ul class="dropdown-menu">
            <li>
               <a href="<c:url value='/logout'/>"><i class="icon-key"></i> Sair</a>
            </li>
         </ul>
      </li>
   </ul>
</div>
<!--close-top-Header-menu-->