package br.com.original.javaweb.despesas.model;

import java.time.LocalDate;

public class Despesa {

	private String descricao;
	private CategoriaDespesa categoria;
	private LocalDate data;
	private double valor;
	private String observacoes;
	
	public Despesa() {}
	
	public Despesa(String descricao, CategoriaDespesa categoria, LocalDate data, double valor)
	{
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setData(data);
		this.setObservacoes(observacoes);
		
		
	}

	private void setCategoria(CategoriaDespesa categoria) {
		// TODO Auto-generated method stub
		this.categoria = categoria; 
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaDespesa getCategoria() {
		return categoria;
	}

		public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
}
