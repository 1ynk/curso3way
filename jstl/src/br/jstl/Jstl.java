package br.jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jstl")
public class Jstl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livro livro = new Livro();
		livro.setAutor("Daniel");
		livro.setDescricao("livro feito");
		livro.setTitulo("The bOOK");
		
		Livro livro2 = new Livro();
		livro2.setAutor("Daniel 2");
		livro2.setDescricao("livro feito 2");
		livro2.setTitulo("The bOOK 2");
		
		Livro livro3 = new Livro();
		livro3.setAutor("Daniel 3");
		livro3.setDescricao("livro feito 3");
		livro3.setTitulo("The bOOK 3");
		
		List<Livro> listarLivros = new ArrayList<Livro>();
		listarLivros.add(livro);
		listarLivros.add(livro2);
		listarLivros.add(livro3);
		
		request.setAttribute("listaLivrosNoAtributo", listarLivros);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listagemJstl.jsp");
		rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
