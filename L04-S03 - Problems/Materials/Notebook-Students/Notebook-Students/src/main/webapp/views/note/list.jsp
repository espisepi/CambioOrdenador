<%--
 * list.jsp
 *
 * Copyright (C) 2017 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<display:table name="notes" pagesize="5" class="displaytag" requestURI="note/customer/list.do" id="row">

	<display:column>
		<a href="note/customer/edit.do?noteId=${row.id}">
			<spring:message code="note.edit" />
		</a>
	</display:column>
	
	<display:column property="moment" titleKey="note.moment" sortable="true" format="{0,date,dd/MM/yyyy HH:mm}" />
	
	<display:column property="title" titleKey="note.title" sortable="true" />
	
</display:table>

<div>
	<a href="note/customer/create.do"> 
		<spring:message	code="note.create" />
	</a>
</div>
