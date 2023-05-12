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

@WebServlet("/busca")
public class BuscaAluno extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AlunoDao dao = new AlunoDao();
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		Aluno aluno = dao.retornaAlunoPorId(id);
		
		request.setAttribute("aluno", aluno);
		
		RequestDispatcher rd = request.getRequestDispatcher("aluno.jsp");
		
		rd.forward(request, response);
	}
}
