package br.com.original.javaweb.despesas.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.original.javaweb.despesas.model.CategoriaDespesa;
import br.com.original.javaweb.despesas.model.Despesa;

public class DAODespesa {

	private List<Despesa> despesas;
	
	public List<Despesa> getDespesas() {
		
		if (this.despesas == null) {
			despesas = new ArrayList<>();
		}
		
		despesas.add(new Despesa("Restaurante",CategoriaDespesa.ALIMENTACAO,LocalDate.now(),89.95));
		despesas.add(new Despesa("Corte de Cabelo",CategoriaDespesa.CUIDADOS_PESSOAIS,LocalDate.now(),45));
		despesas.add(new Despesa("Combustivel",CategoriaDespesa.VEICULO,LocalDate.now(),80));
		despesas.add(new Despesa("Tênis",CategoriaDespesa.VESTUARIO,LocalDate.now(),237));
		despesas.add(new Despesa("Almoço",CategoriaDespesa.ALIMENTACAO,LocalDate.now(),30));
		despesas.add(new Despesa("Corte de Energia",CategoriaDespesa.MORADIA,LocalDate.now(),170));
		despesas.add(new Despesa("Pagamento Pós",CategoriaDespesa.EDUCACAO,LocalDate.now(),850));
		despesas.add(new Despesa("Plano de Saúde",CategoriaDespesa.SAUDE,LocalDate.now(),360));
		
		return despesas;
	}
	
}
