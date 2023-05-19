<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ page import="br.com.projetoservlet.model.Aluno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Aluno</title>
</head>
<body>

	<% Aluno aluno = (Aluno) request.getAttribute("aluno"); %>
	<div style="margin:50px;">	
		<form action="editar" method="post">
			
			<label>
				id:
				<input type="text" name="id" value=<%= aluno.getId()%> readonly/>
			</label>
			<br/>
			<label>
				nome:
				<input type="text" name="nome" value=<%= aluno.getNome()%> />
			</label>
			<br/>
			<label>
				idade:
				<input type="text" name="idade" value=<%= aluno.getIdade()%> />
			</label>
			<br/>
			<label>
				endereço:
				<input type="text" name="endereco" value=<%= aluno.getEndereco()%> />
			</label>
			<br/>
			<label>
				curso:
				<input type="text" name="curso" value=<%= aluno.getCurso()%> />
			</label>
			<br/>
			<label>
				turno:
				<input type="text" name="turno" value=<%= aluno.getTurno()%> />
			</label>
			<br/>
			<button type="submit">editar</button>
		</form>
	</div>
</body>
</html>