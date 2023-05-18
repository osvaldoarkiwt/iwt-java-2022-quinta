package br.com.projetoservlet.servlet;

import java.io.IOException;
import java.util.List;

import br.com.projetoservlet.alunodao.AlunoDao;
import br.com.projetoservlet.model.Aluno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/excluir")
public class ExcluirAluno extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AlunoDao dao = new AlunoDao();
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		dao.deletarAluno(id);
		
		response.sendRedirect("alunos");
		
	}
}
