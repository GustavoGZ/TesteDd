package br.emprestimo.modelo;

import java.util.ArrayList;

public class EmprestimoDAO {
ArrayList<Emprestimo> emprestimos =new ArrayList<Emprestimo>();
	public boolean adiciona(Emprestimo umEmprestimo) {
	return emprestimos.add(umEmprestimo);
	}
	public Emprestimo consulta(String codigoUsuario) {
		Emprestimo emprestimo = null;
		return emprestimo;
	}

}
