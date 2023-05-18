package br.com.projetoservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.projetoservlet.alunodao.AlunoDao;
import br.com.projetoservlet.model.Aluno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/alunos")
public class BuscarTodos extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AlunoDao dao = new AlunoDao();
		
		List<Aluno> alunos = dao.retornarAlunos();
		
		request.setAttribute("alunos", alunos);
		
		RequestDispatcher rd = request.getRequestDispatcher("alunos.jsp");
		
		rd.forward(request, response);
		
	}
}
