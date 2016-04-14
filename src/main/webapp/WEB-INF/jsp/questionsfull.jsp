<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>
<form:form method="POST" commandName="answer">

	<c:forEach items="${questionsfull}" var="answer">
		${answer.question} <br />
		<form:radiobutton name="1" path="option1" value="1"></form:radiobutton>${answer.answer1}
		<form:radiobutton name="1"  path="option2" value="2"></form:radiobutton>${answer.answer2}
		<form:radiobutton name="1"  path="option3" value="3"></form:radiobutton>${answer.answer3}
		<form:radiobutton name="1"  path="option4" value="4"></form:radiobutton>${answer.answer4} <br />
		<br />

	</c:forEach>

</form:form>

<form:form method="POST" commandName="answer1">

	<c:forEach items="${questionsfull}" var="answer1">
		${answer1.question} <br />
		<form:radiobutton name="2" path="option5" value="1"></form:radiobutton>${answer1.answer1}
		<form:radiobutton path="option6" value="2"></form:radiobutton>${answer1.answer2}
		<form:radiobutton path="option7" value="3"></form:radiobutton>${answer1.answer3}
		<form:radiobutton path="option8" value="4"></form:radiobutton>${answer1.answer4} <br />
		<br />

	</c:forEach>

</form:form>