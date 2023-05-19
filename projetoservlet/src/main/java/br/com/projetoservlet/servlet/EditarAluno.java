package br.com.projetoservlet.servlet;

import java.io.IOException;

import br.com.projetoservlet.alunodao.AlunoDao;
import br.com.projetoservlet.model.Aluno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editar")
public class EditarAluno extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AlunoDao dao = new AlunoDao();
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		String nome = request.getParameter("nome");
		
		Integer idade = Integer.parseInt(request.getParameter("idade"));
		
		String endereco = request.getParameter("endereco");
		
		String curso = request.getParameter("curso");
		
		String turno = request.getParameter("turno");
		
		Aluno aluno = new Aluno(nome,idade,endereco,curso,turno);
		
		dao.editarAluno(id, aluno);
	
		response.sendRedirect("alunos");
	}
}
