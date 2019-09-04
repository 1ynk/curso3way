package br.bd;

import java.util.List;

public class Projeto {
	private String descricao;
	private List<Funcionario> funcionarios;

	public List<Funcionario> getNome() {
		return funcionarios;
	}

	public void setNome(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
