<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>

	<h2> 강아지 소개 </h2>
	<hr>
	<form action="dogInsertProc.do" method="get">
	<table border="1">
		<tr height="40">
			<td align="center" width="150"> 강아지 이름 </td>
			<td align="center" width="250">
				<input type="text" name="name">
			</td>		
		</tr>
		<tr height="40">
			<td align="center" width="150"> 보호자 성함 </td>
			<td align="center" width="250">
				<input type="text" name="host">
			</td>		
		</tr>
		<tr height="40">
			<td align="center" width="150"> 강아지 종류 </td>
			<td align="center" width="250">
				<input type="text" name="breed">
			</td>		
		</tr>
		<tr height="40">
			<td align="center" width="150"> 강아지 성별 </td>
			<td align="center" width="250">
				<input type="text" name="sex">
			</td>		
		</tr>
		<tr height="40">
			<td align="center" width="150"> 강아지 나이 </td>
			<td align="center" width="250">
				<input type="number" name="age">
			</td>		
		</tr>	
			
		
		<tr height="40">
			<td align="center" colspan="2">
				<input type="submit" value="강아지 등록" >
				<input type="reset" value="강아지 등록 취소" >
			</td>	
		</tr>	
	</table>	
	</form>
	</center>

</body>
</html>