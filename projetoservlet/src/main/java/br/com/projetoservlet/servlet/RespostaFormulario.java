package br.com.projetoservlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import br.com.projetoservlet.alunodao.AlunoDao;
import br.com.projetoservlet.model.Aluno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aluno")
public class RespostaFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		
		AlunoDao dao = new AlunoDao();
		
		String nome = Optional.ofNullable(request.getParameter("nome"))
				.orElse("informe a banda na url");
		
		Integer idade =Integer.parseInt(Optional.ofNullable(request.getParameter("idade"))
				.orElse("0"));
		
		String endereco = Optional.ofNullable(request.getParameter("endereco"))
				.orElse("informe a banda na url");
		
		String curso = Optional.ofNullable(request.getParameter("curso"))
				.orElse("informe a banda na url");
		
		String turno = Optional.ofNullable(request.getParameter("turno"))
				.orElse("informe a banda na url");
		
		
		
		Aluno aluno = new Aluno(nome,idade,endereco,curso,turno);
	
		dao.matricularAluno(aluno);
		
		request.setAttribute("aluno", aluno);
		
		RequestDispatcher rd = request.getRequestDispatcher("aluno.jsp");
		
		rd.forward(request, response);
	}
}
