package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.classe.pessoa.Pessoa;

@WebServlet("/Pessoa")
public class ServletPessoas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(007);
		pessoa.setIdade(26);
		pessoa.setNome("Daniel");
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setId(001);
		pessoa1.setIdade(31);
		pessoa1.setNome("Fulano");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setId(002);
		pessoa2.setIdade(22);
		pessoa2.setNome("Beltrano");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setId(003);
		pessoa3.setIdade(22);
		pessoa3.setNome("Ciclano");
		
		List<Pessoa> listarPessoas = new ArrayList<Pessoa>();
		
		listarPessoas.add(pessoa);
		listarPessoas.add(pessoa1);
		listarPessoas.add(pessoa2);
		listarPessoas.add(pessoa3);
		
		request.setAttribute("listarPessoas", listarPessoas);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listagemJstl.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
