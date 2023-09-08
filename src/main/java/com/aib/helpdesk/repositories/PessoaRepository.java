package com.aib.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aib.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
