package br.com.original.springmvc.gerenciadordespesas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.original.springmvc.gerenciadordespesas.model.Despesa;

@Controller
public class DespesaController {
	
	@RequestMapping("/despesas/nova")
	public String nova() {
		return "CadastroDespesa";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Despesa despesa) {
		System.out.println("Despesa gravada : " + despesa.getDescricao());
		return "CadastroDespesa";
	}
	
}
