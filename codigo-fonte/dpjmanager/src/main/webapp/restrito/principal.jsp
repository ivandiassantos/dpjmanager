<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags/novo" prefix="customTags"%>
<customTags:template>
   <div class="row">
	   <div class="col-lg-12">
	       <h1 class="page-header">Dashboard - Diretoria</h1>
	   </div>
      <div class="col-lg-12">
         <div class="panel panel-default">
            <div class="panel-heading">
               Faturamento - 2016
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
               <div id="faturamentoPorProjeto"></div>
               <br/>
               <table width="100%" class="table table-striped table-bordered table-hover" id="tabelaFaturamentoProjetos">
                  <thead>
                     <tr>
                        <th>Mês</th>
                        <th>Valor Acumulado</th>
                        <th>Meta Acumulada</th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
                        <td>Janeiro/2016</td>
                        <td>3.000.000,00</td>
                        <td>1.801.568,33</td>
                     </tr>
                     <tr>
                        <td>Fevereiro/2016</td>
                        <td>6.000.000,00</td>
                        <td>5.739.268,77</td>
                     </tr>
                     <tr>
                        <td>Março/2016</td>
                        <td>9.000.000,00</td>
                        <td>8.172.535,88</td>
                     </tr>
                     <tr>
                        <td>Abril/2016</td>
                        <td>11.916.666,67</td>
                        <td>10.663.259,34</td>
                     </tr>
                     <tr>
                        <td>Maio/2016</td>
                        <td>14.750.000,00</td>
                        <td>13.088.074,81</td>
                     </tr>
                     <tr>
                        <td>Junho/2016</td>
                        <td>17.583.333,33</td>
                        <td>14.841.384,60</td>
                     </tr>         
                  </tbody>
               </table>
            </div>
            <!-- /.panel-body -->
         </div>
         <!-- /.panel -->
      </div>
   </div>
   <div class="row">
      <div class="col-lg-4">
         <div class="panel panel-default">
            <div class="panel-heading">
               UPJ-BASA
            </div>
            <div class="panel-body">
               <p></p>
            </div>
            <div class="panel-footer">
               Panel Footer
            </div>
         </div>
      </div>
   </div>
   <script type="text/javascript">
	    $(function() {
	        obtemGraficoFaturamentoPorProjeto();
	        $('#tabelaFaturamentoProjetos').DataTable();
	    });
	
	    function obtemGraficoFaturamentoPorProjeto(){
	    	 $.getJSON("${pageContext.request.contextPath}/restrito/dashboard/listarFaturamentoProjeto", function(resultado){
			       var months = ["Janeiro/2016", "Fevereiro/2016", "Março/2016", "Abril/2016", "Maio/2016", "Junho/2016", "Julho/2016", "Agosto/2016", "Setembro/2016", "Outubro/2016", "Novembro/2016", "Dezembro/2016"];
			       Morris.Line({
			    	   element: 'faturamentoPorProjeto',
			    	   data: resultado,
	               xkey: 'mesAnoFaturamentoProjeto',
	               ykeys: ['valorMetaAcumulada', 'valorAcumulado'],
	               labels: ['Meta Acumulada', 'Valor Acumulado'],
	               xLabelFormat: function(x) { // <--- x.getMonth() returns valid index
	            	   var month = months[x.getMonth()];
	            	   return month;
	            	},
	               dateFormat: function(x) {
	            	   var month = months[new Date(x).getMonth()];
	            	   return month;
	               },
	             }); 
	       }); 
	    }
    </script>
</customTags:template>