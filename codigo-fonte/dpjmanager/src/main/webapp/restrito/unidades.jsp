<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<customTags:templateDashboard>
	<div class="row">
		<div class="span12">
			<div class="widget">
				<div class="widget-header"> <i class="icon-signal"></i>
					<h3>UPJ</h3>
				</div>
				<div class="widget-content">
					<canvas id="area-chart" class="chart-holder" height="250"  width="600"></canvas>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="span4">
			<div class="widget">
				<div class="widget-header"> <i class="icon-signal"></i>
					<h3>UPJ-BASA</h3>
				</div>
				<div class="widget-content">
					<div id="big_stats" class="cf">
                  <div class="stat">
                    <a href="<c:url value='/dashboardUnidade/iniciarDashboardUnidade'/>">
		                 <i class="icon-search"></i>
		                 <span class="value">851</span>
	                 </a>
	               </div>
	               <!-- .stat -->
	               <div class="stat">
	                 <i class="icon-thumbs-up-alt"></i>
	                 <span class="value">423</span>
	               </div>
	               <!-- .stat -->
	               <div class="stat">
	                 <i class="icon-twitter-sign"></i>
	                 <span class="value">922</span>
	               </div>
	               <!-- .stat -->
               </div>
				</div>
			</div>
		</div>
		<div class="span4">
			<div class="widget">
				<div class="widget-header"> <i class="icon-signal"></i>
					<h3>UPJ-BRB</h3>
				</div>
				<div class="widget-content">
					<div id="big_stats" class="cf">
	                    <div class="stat"> <i class="icon-anchor"></i> <span class="value">851</span> </div>
	                    <!-- .stat -->
	                    <div class="stat"> <i class="icon-thumbs-up-alt"></i> <span class="value">423</span> </div>
	                    <!-- .stat -->
	                    <div class="stat"> <i class="icon-twitter-sign"></i> <span class="value">922</span> </div>
	                    <!-- .stat -->
                  	</div>
				</div>
			</div>
		</div>
		<div class="span4">
			<div class="widget">
				<div class="widget-header"> <i class="icon-signal"></i>
					<h3>UPJ-CAIXA</h3>
				</div>
				<div class="widget-content">
					<div id="big_stats" class="cf">
	                    <div class="stat"> <i class="icon-anchor"></i> <span class="value">851</span> </div>
	                    <!-- .stat -->
	                    <div class="stat"> <i class="icon-thumbs-up-alt"></i> <span class="value">423</span> </div>
	                    <!-- .stat -->
	                    <div class="stat"> <i class="icon-twitter-sign"></i> <span class="value">922</span> </div>
	                    <!-- .stat -->
                  	</div>
				</div>
			</div>
		</div>
	</div>
</customTags:templateDashboard>