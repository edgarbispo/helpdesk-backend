package com.aib.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aib.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
