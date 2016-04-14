<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<form:form method="POST" commandName="answer">
		<c:forEach items="${showquestions}" var="answer" begin="0" end="0">
		${answer.question} <br />
		<form:radiobutton path="question" value="1"></form:radiobutton>${answer.answer1}
		<form:radiobutton path="question" value="2"></form:radiobutton>${answer.answer2}
		<form:radiobutton path="question" value="3"></form:radiobutton>${answer.answer3}
		<form:radiobutton path="question" value="4"></form:radiobutton>${answer.answer4} <br />
		<br />

	</c:forEach>
</form:form>
<form:form method="POST" commandName="answer">
		<c:forEach items="${showquestions}" var="answer" begin="1" end="1">
		${answer.question} <br />
		<form:radiobutton path="question" value="1"></form:radiobutton>${answer.answer1}
		<form:radiobutton path="question" value="2"></form:radiobutton>${answer.answer2}
		<form:radiobutton path="question" value="3"></form:radiobutton>${answer.answer3}
		<form:radiobutton path="question" value="4"></form:radiobutton>${answer.answer4} <br />
		<br />

	</c:forEach>
</form:form>