package br.com.projetoservlet.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;


@WebServlet("/resposta")
public class Resposta extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String nome = Optional.ofNullable(request.getParameter("nome"))
				.orElse("informe a banda na url");
		
		String senha = Optional.ofNullable(request.getParameter("senha"))
				.orElse("informe a banda na url");
		
		PrintWriter out = response.getWriter();
		out.write("<head><meta charset='utf-8' /></head>");
		out.write("<h1>");
		out.write("recebendo os dados de um formulário");
		out.write("</h1>");
		out.write("<p>"+nome+"</p>");
		out.write("<p>"+senha+"</p>");
	
		
	}
}
