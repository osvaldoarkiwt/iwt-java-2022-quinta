<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="java.util.List" import="br.com.projetoservlet.model.Aluno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Página de alunos</title>
</head>
<body>

	<% List<Aluno> alunos = (List<Aluno>) request.getAttribute("alunos"); %>

	<div style="margin:50px;">
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>nome</th>
				<th>idade</th>	
				<th>endereço</th>
				<th>curso</th>
				<th>turno</th>
				<th>ações</th>				
			</tr>
		</thead>
		<tbody>
			
			<% for(Aluno aluno : alunos){ %>
				
				<tr>
					<td><%= aluno.getId() %></td>
					<td><%= aluno.getNome() %></td>
					<td><%= aluno.getIdade() %></td>
					<td><%= aluno.getEndereco() %></td>
					<td><%= aluno.getCurso() %></td>
					<td><%= aluno.getTurno() %></td>
					<td></td>
				</tr>
				
			<%} %>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="7">rodapé</td>
			</tr>
		</tfoot>
	</table>
	</div>

</body>
</html>