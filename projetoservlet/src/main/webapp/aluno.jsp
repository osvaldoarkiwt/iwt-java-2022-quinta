<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="br.com.projetoservlet.model.Aluno" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% Aluno aluno = (Aluno) request.getAttribute("aluno"); %>
	<div style="margin:50px;">	
		<p><%= aluno.getNome() %></p>
		<p><%= aluno.getIdade() %></p>
		<p><%= aluno.getEndereco() %></p>
		<p><%= aluno.getCurso() %></p>
		<p><%= aluno.getTurno() %></p>
	</div>

</body> 
</html>