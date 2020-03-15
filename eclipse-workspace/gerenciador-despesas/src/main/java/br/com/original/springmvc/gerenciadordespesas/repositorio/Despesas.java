package br.com.original.springmvc.gerenciadordespesas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.original.springmvc.gerenciadordespesas.model.Despesa;

public interface Despesas extends JpaRepository<Despesa,Long> {

}
