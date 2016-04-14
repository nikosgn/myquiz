<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<table class="table table-bordered table-hover table-striped">
	<thead>


			<th>Question name</th>

		
			<th>Question id</th>
		
		
			<th>Question answer</th>
	

	</thead>

	<tbody>
		<c:forEach items="${questions}" var="question">

			<tr>
				<td>${question.question}</td>

				<td>${question.questionId}</td>

				<td>${question.rightAnswer}</td>

			</tr>
		</c:forEach>

	</tbody>

</table>