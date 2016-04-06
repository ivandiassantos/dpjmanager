<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<customTags:template>
	<div class="row">
    	<div class="col-md-12 col-sm-12 col-xs-12">
        	<div class="dashboard_graph">
            	<div class="row x_title">
                	<div class="col-md-6">
                    	<h3>UPJ</h3>
                    </div>
                    <div class="col-md-6">
                        <div id="reportrange" class="pull-right" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
                            <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                            <span>Dezembro/2015 - Abril/2016</span>
                        </div>
                    </div>
                </div>
                <div class="col-md-9 col-sm-9 col-xs-12">
                    <div id="placeholder33" style="height: 260px; display: none" class="demo-placeholder"></div>
                    <div style="width: 100%;">
                        <div id="canvas_dahs" class="demo-placeholder" style="width: 100%; height:270px;"></div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-3 col-xs-12 bg-white">
	                <div class="x_title">
	                    <h2>Indicadores</h2>
	                    <div class="clearfix"></div>
	                </div>
                    <div class="col-md-12 col-sm-12 col-xs-6">
                        <div>
                            <p>Faturamento</p>
                            <div class="">
                                <div class="progress progress_sm" style="width: 76%;">
                                    <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="80"></div>
                                </div>
                            </div>
                        </div>
                        <div>
                            <p>Recebimento</p>
                            <div class="">
                                <div class="progress progress_sm" style="width: 76%;">
                                    <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="80"></div>
                                </div>
                            </div>
                        </div>
                     </div>
                </div>
                <div class="clearfix"></div>
            </div>
          </div>
      </div>
      <br />
      <div class="row">
	      <div class="col-md-4 col-sm-4 col-xs-12">
	      	<div class="x_panel tile fixed_height_320">
	        	<div class="x_title">
	            	<h2>UPJ - BASA</h2>
	                <ul class="nav navbar-right panel_toolbox">
	                    <li class="dropdown">
	                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" ><i class="fa fa-search"></i></a>
	                        <ul class="dropdown-menu" role="menu">
	                            <li><a href="#">Administrativo</a>
	                            </li>
	                            <li><a href="#">Planejamento</a>
	                            </li>
	                        </ul>
	                    </li>
	                 </ul>
	                 <div class="clearfix"></div>
	             </div>
	             <div class="x_content">
	                 <div class="dashboard-widget-content">
	                     <div class="sidebar-widget">
	                         <h4>Profile Completion</h4>
	                         <canvas width="150" height="80" id="foo" class="" style="width: 160px; height: 100px;"></canvas>
	                         <div class="goal-wrapper">
	                             <span class="gauge-value pull-left">$</span>
	                             <span id="gauge-text" class="gauge-value pull-left">3,200</span>
	                             <span id="goal-text" class="goal-value pull-right">$5,000</span>
	                         </div>
	                     </div>
	                 </div>
	             </div>
	           </div>
	       </div>
       </div>
<!--    <div class="col-md-12 col-sm-12 col-xs-12"> -->
<!--          <div class="x_panel" style="height:600px;"> -->
<!--              <div class="x_title"> -->
<!--                  <h2>UNIDADES</h2> -->
<!--                  <div class="clearfix"></div> -->
<!--              </div> -->
<!--              <div class="x_content"> -->
<!--              	<div class="row"> -->
<!--                     <div class="col-md-12 col-sm-12 col-xs-12"> -->
<!--                         <div class="dashboard_graph"> -->
<!--                             <div class="row x_title"> -->
<!--                                 <div class="col-md-6"> -->
<!--                                     <h3>UPJ</h3> -->
<!--                                 </div> -->
<!--                                 <div class="col-md-6"> -->
<!--                                     <div id="reportrange" class="pull-right" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc"> -->
<!--                                         <i class="glyphicon glyphicon-calendar fa fa-calendar"></i> -->
<!--                                         <span>Dezembro/2015 - Abril/2016</span> <b class="caret"></b> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->

<!--                             <div class="col-md-9 col-sm-9 col-xs-12"> -->
<!--                                 <div id="placeholder33" style="height: 260px; display: none" class="demo-placeholder"></div> -->
<!--                                 <div style="width: 100%;"> -->
<!--                                     <div id="canvas_dahs" class="demo-placeholder" style="width: 100%; height:270px;"></div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="col-md-3 col-sm-3 col-xs-12 bg-white"> -->
<!--                                 <div class="x_title"> -->
<!--                                     <h2>Performance</h2> -->
<!--                                     <div class="clearfix"></div> -->
<!--                                 </div> -->

<!--                                 <div class="col-md-12 col-sm-12 col-xs-6"> -->
<!--                                     <div> -->
<!--                                         <p>Faturamento</p> -->
<!--                                         <div class=""> -->
<!--                                             <div class="progress progress_sm" style="width: 80%;"> -->
<!--                                                 <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="80"></div> -->
<!--                                             </div> -->
<!--                                         </div> -->
<!--                                     </div> -->
<!--                                     <div> -->
<!--                                         <p>Recebido</p> -->
<!--                                         <div class=""> -->
<!--                                             <div class="progress progress_sm" style="width: 80%;"> -->
<!--                                                 <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="80"></div> -->
<!--                                             </div> -->
<!--                                         </div> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                             <div class="clearfix"></div> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <br /> -->
<!--                	<div class="row"> -->
<!--                   <div class="col-md-4 col-sm-4 col-xs-12"> -->
<!--                      <div class="x_panel tile fixed_height_320"> -->
<!--                         <div class="x_title"> -->
<!--                             <h2>UPJ-BASA</h2> -->
<!--                             <div class="clearfix"></div> -->
<!--                          </div> -->
<!--                          <div class="x_content"> -->
<!--                              <div class="dashboard-widget-content"> -->
<!--                                  <ul class="quick-list"> -->
<!--                                      <li> -->
<%--                                          <i class="fa fa-link"></i><a href="<c:url value='/projeto/listarProjetosPorCliente/41'/>">Detalhar</a> --%>
<!--                                      </li> -->
<!--                                  </ul> -->
   
<!--                                  <div class="sidebar-widget"> -->
<!--                                      <h4>Status</h4> -->
<%--                                      <canvas width="150" height="80" id="foo" class="" style="width: 160px; height: 100px;"></canvas> --%>
<!--                                      <div class="goal-wrapper"> -->
<!--                                          <span class="gauge-value pull-left">$</span> -->
<!--                                          <span id="gauge-text" class="gauge-value pull-left">3,200</span> -->
<!--                                          <span id="goal-text" class="goal-value pull-right">$5,000</span> -->
<!--                                      </div> -->
<!--                                  </div> -->
<!--                              </div> -->
<!--                          </div> -->
<!--                      </div> -->
<!--                   </div> -->
<!--                </div> -->
<!--              </div> -->
<!--          </div> -->
<!--      </div> -->
     <script>
        $(document).ready(function () {
            // [17, 74, 6, 39, 20, 85, 7]
            //[82, 23, 66, 9, 99, 6, 2]
            var data1 = [[gd(2012, 1, 1), 17], [gd(2012, 1, 2), 74], [gd(2012, 1, 3), 6], [gd(2012, 1, 4), 39], [gd(2012, 1, 5), 20], [gd(2012, 1, 6), 85], [gd(2012, 1, 7), 7]];

            var data2 = [[gd(2012, 1, 1), 82], [gd(2012, 1, 2), 23], [gd(2012, 1, 3), 66], [gd(2012, 1, 4), 9], [gd(2012, 1, 5), 119], [gd(2012, 1, 6), 6], [gd(2012, 1, 7), 9]];
            $("#canvas_dahs").length && $.plot($("#canvas_dahs"), [
                data1, data2
            ], {
                series: {
                    lines: {
                        show: false,
                        fill: true
                    },
                    splines: {
                        show: true,
                        tension: 0.4,
                        lineWidth: 1,
                        fill: 0.4
                    },
                    points: {
                        radius: 0,
                        show: true
                    },
                    shadowSize: 2
                },
                grid: {
                    verticalLines: true,
                    hoverable: true,
                    clickable: true,
                    tickColor: "#d5d5d5",
                    borderWidth: 1,
                    color: '#fff'
                },
                colors: ["rgba(38, 185, 154, 0.38)", "rgba(3, 88, 106, 0.38)"],
                xaxis: {
                    tickColor: "rgba(51, 51, 51, 0.06)",
                    mode: "time",
                    tickSize: [1, "day"],
                    //tickLength: 10,
                    axisLabel: "Date",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 10
                        //mode: "time", timeformat: "%m/%d/%y", minTickSize: [1, "day"]
                },
                yaxis: {
                    ticks: 8,
                    tickColor: "rgba(51, 51, 51, 0.06)",
                },
                tooltip: false
            });

            function gd(year, month, day) {
                return new Date(year, month - 1, day).getTime();
            }
        });
    </script>
</customTags:template>