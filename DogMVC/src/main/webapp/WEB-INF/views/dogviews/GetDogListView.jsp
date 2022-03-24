<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2> 강아지 전체 보기</h2>
	<hr>
	<a href="dogInsert.do">강아지 등록하기 </a>
	<table border="1">
		<tr height="30" bgcolor="yellow">
			<td width="150" align="center"> 번호 </td>
			<td width="150" align="center"> 강아지 이름 </td> 
			<td width="150" align="center"> 보호자 이름 </td>
			<td width="150" align="center"> 강아지 종류 </td>
			<td width="150" align="center"> 강아지 성별</td>
			<td width="150" align="center"> 강아지 나이 </td>
		</tr>
		<c:forEach items="${dlist}" var="dog">
		<tr height="30">
			<td width="150" align="center"> ${dog.num} </td>
			<td width="150" align="center"> ${dog.name} </a></td>
			<td width="150" align="center"> ${dog.host} </td>
			<td width="150" align="center"> ${dog.breed} </td>
			<td width="150" align="center"> ${dog.sex}</td>
			<td width="150" align="center"> ${dog.age}</td>
		</tr>
		</c:forEach>			
	</table>
</center>

</body>
</html>