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

<form:form action="note/customer/edit.do" modelAttribute="note">

	<form:hidden path="id" />
	<form:hidden path="version" />
	<form:hidden path="customer" />	

	<form:label path="title">
		<spring:message code="note.title" />:
	</form:label>
	<form:input path="title" />
	<form:errors cssClass="error" path="title" />
	<br />

	<form:label path="moment">
		<spring:message code="note.moment" />:
	</form:label>
	<form:input path="moment" readonly="true" />
	<form:errors cssClass="error" path="moment" />
	<br />

	<form:label path="text">
		<spring:message code="note.text" />:
	</form:label>
	<form:textarea path="text" />
	<form:errors cssClass="error" path="text" />
	<br />
	
	<input type="submit" name="save" value="<spring:message code="note.save" />" />&nbsp; 
	<jstl:if test="${note.id != 0}">
		<input type="submit" name="delete"
			value="<spring:message code="note.delete" />"
			onclick="return confirm('<spring:message code="note.confirm.delete" />')" />&nbsp;
	</jstl:if>
	<input type="button" name="cancel"
		value="<spring:message code="note.cancel" />"
		onclick="javascript: window.location.replace('note/customer/list.do')" />
	<br />

</form:form>